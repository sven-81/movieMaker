package main.kotlin.de.moviemaker.rating

import main.kotlin.de.moviemaker.Movie

interface Rating {
    fun getScore(movie: Movie): Int

    fun getInfoText(movie: Movie): String {
        if (getScore(movie) > 5) {
            return "Toller Film"
        }
        return "Mieser Film"
    }
}