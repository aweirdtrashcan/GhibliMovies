package com.aweirdtrashcan.ghiblimovies.repository

import com.aweirdtrashcan.ghiblimovies.data.remote.GhibliApi
import com.aweirdtrashcan.ghiblimovies.models.Movies
import javax.inject.Inject

class MoviesRepository @Inject constructor(
    private val api: GhibliApi
) {
    suspend fun getAllMovies(): Array<Movies> {
        return api.getAllMovies()
    }
}