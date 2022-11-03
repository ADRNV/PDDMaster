package com.adrianov.pddmaster.core.repositories

interface ReadRepository<I:Any,D> {
    suspend fun get():D

    suspend fun get(id: I):D
}