package com.adrianov.pddmaster.domain.models

data class Question(var id:Long,
                    var text: String = "empty",
                    var questionImage: String,
                    var answers:List<Answer>,
                    var answer: Answer
){

}