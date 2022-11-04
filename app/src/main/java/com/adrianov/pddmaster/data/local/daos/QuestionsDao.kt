package com.adrianov.pddmaster.data.local.daos

import androidx.room.Query
import androidx.room.Transaction
import com.adrianov.pddmaster.data.local.dtos.Question

interface QuestionsDao {
    @Query("SELECT * FROM Question")
    fun getAll():List<Question>
    @Query("SELECT * FROM Question LIMIT (:lim)")
    fun getTop(lim:Int):List<Question>
    @Query("SELECT * FROM Question WHERE questionId=(:id)")
    fun get(id:Long):Question
}