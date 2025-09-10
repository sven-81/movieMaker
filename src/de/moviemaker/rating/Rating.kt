package de.moviemaker.rating

import de.moviemaker.Movie

interface Rating {
    fun getScore(movie: Movie): Int

    fun getInfoText(movie: Movie): String {
        if (getScore(movie) > 5) {
            return "Toller Film"
        }
        return "Mieser Film"
    }
}