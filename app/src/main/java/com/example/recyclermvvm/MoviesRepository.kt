package com.example.recyclermvvm

class MoviesRepository(
    private val api : MoviesApi
) : SafeApiRequest() {

    suspend fun getMovies() = apiRequest { api.getMovies() }

}