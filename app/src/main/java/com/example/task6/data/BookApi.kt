package com.example.task6.data

import retrofit2.http.GET

interface BookApi {
    @GET("books")
    suspend fun getAllbooks():List<AllBooks>
}