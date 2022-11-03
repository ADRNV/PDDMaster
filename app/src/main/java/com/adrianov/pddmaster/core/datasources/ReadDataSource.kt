package com.adrianov.pddmaster.core.datasources

interface ReadDataSource<I:Any,D> {
    suspend fun get():D

    suspend fun get(id: I):D
}