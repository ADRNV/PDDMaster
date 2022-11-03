package com.adrianov.pddmaster.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.adrianov.pddmaster.data.local.daos.AnswersDao
import com.adrianov.pddmaster.data.local.daos.QuestionsDao
import com.adrianov.pddmaster.data.local.dtos.Answer
import com.adrianov.pddmaster.data.local.dtos.Question

@Database(entities = [Question::class, Answer::class], version = 1)
abstract class PddDataBase: RoomDatabase() {
    abstract fun questionDao():QuestionsDao
    abstract fun answersDao():AnswersDao
}