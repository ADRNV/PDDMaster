package com.adrianov.pddmaster.data.local.dtos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Question(@PrimaryKey(autoGenerate = true) val questionId:Long,
                    @ColumnInfo(name = "text") val text: String = "empty",
                    @ColumnInfo(name = "questionImage")val questionImage: String,
                    @ColumnInfo(name = "answer")val answer: Answer
) {
}