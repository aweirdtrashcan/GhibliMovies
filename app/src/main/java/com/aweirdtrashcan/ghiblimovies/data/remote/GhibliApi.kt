package com.aweirdtrashcan.ghiblimovies.data.remote

import com.aweirdtrashcan.ghiblimovies.models.Movies
import retrofit2.http.GET

interface GhibliApi {
    @GET("/")
    suspend fun getAllMovies(): Array<Movies>
}