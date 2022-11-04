package com.adrianov.pddmaster.data.local

import com.adrianov.pddmaster.data.local.dtos.Answer
import com.adrianov.pddmaster.data.local.dtos.Question

typealias DomainQuestion = com.adrianov.pddmaster.domain.models.Question

typealias DomainAnswer = com.adrianov.pddmaster.domain.models.Answer

fun Question.toDomain(answers: List<DomainAnswer>) =
    DomainQuestion(this.questionId,
        this.text,
        this.questionImage,
        answers,
        this.answer.toDomain())


fun Answer.toDomain() = DomainAnswer(this.answerId, this.text)

fun List<Answer>.toDomain(): List<DomainAnswer>{
    val mapped = mutableListOf<DomainAnswer>()

    this.forEach {
        mapped.add(it.toDomain())
    }

    return mapped
}