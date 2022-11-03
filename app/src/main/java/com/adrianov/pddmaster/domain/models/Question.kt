package com.adrianov.pddmaster.domain.models

data class Question(val id:Int,
                    val text: String = "empty",
                    val questionImage: String,
                    val answers:List<Answer>,
                    val answer: Answer
){

}