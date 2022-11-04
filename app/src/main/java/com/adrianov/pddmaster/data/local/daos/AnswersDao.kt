package com.adrianov.pddmaster.data.local.daos

import androidx.room.Query
import com.adrianov.pddmaster.data.local.dtos.Answer

interface AnswersDao {
    @Query("SELECT * FROM answer")
    fun getAll():List<Answer>
    @Query("SELECT * FROM answer LIMIT (:lim)")
    fun getAll(lim:Int): List<Answer>
    @Query("SELECT * FROM answer WHERE answerId=(:id)")
    fun get(id:Long):Answer
    @Query("SELECT * FROM answer WHERE relatedQuestionId=(:id)")
    fun getRelated(id:Long):List<Answer>
}