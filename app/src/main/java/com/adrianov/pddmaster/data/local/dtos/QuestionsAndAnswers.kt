package com.adrianov.pddmaster.data.local.dtos

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation

@Entity
data class QuestionsAndAnswers(
    @Embedded val question: Question,
    @Relation(
        entity = Question::class,
        parentColumn = "questionId",
        entityColumn = "relatedQuestionId"

    ) val answers:List<Answer>
) {
}