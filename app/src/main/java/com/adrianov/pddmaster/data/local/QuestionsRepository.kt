package com.adrianov.pddmaster.data.local

import android.content.Context
import androidx.room.Room
import com.adrianov.pddmaster.core.repositories.ReadRepository
import com.adrianov.pddmaster.data.local.db.PddDataBase
import com.adrianov.pddmaster.domain.models.Question
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuestionsRepository(@Inject val context: Context) : ReadRepository<Long, Question> {

    private val db = Room.databaseBuilder(context.applicationContext,
        PddDataBase::class.java,
        "PddTests")
        .build()

    private val questions = db.questionDao()
    private val answers = db.answersDao()

    override suspend fun get(): List<Question> = questions.getAll().flatMap {
        val mapped = emptyList<Question>().toMutableList()
        val answers = answers.getRelated(it.questionId).toDomain()
        mapped.add(it.toDomain(answers))
        return@flatMap mapped
    }

    override suspend fun get(id: Long): Question{

        val answers = this.answers.getRelated(id).toDomain()

        return questions.get(id).toDomain(answers)
    }
}