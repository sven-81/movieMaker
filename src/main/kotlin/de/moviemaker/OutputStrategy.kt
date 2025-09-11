package main.kotlin.de.moviemaker

interface OutputStrategy {
    fun introduction(): String
    fun description(movie: Movie): String
    fun analyze(movie: Movie): String
}
