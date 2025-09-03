package de.moviemaker

interface Rating {
    fun getScore(movie: Movie): Int

    fun getInfoText(movie: Movie): String {
        if (getScore(movie) > 5) {
            return "Toller Film"
        }
        return "Mieser Film"
    }
}