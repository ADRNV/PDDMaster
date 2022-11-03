package com.adrianov.pddmaster.data.local.dtos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Answer(@PrimaryKey(autoGenerate = true) val answerId:Long,
             val relatedQuestionId:Long,
             val text:String) {
}