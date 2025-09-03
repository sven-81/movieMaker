package de.moviemaker

import kotlin.random.Random

class RandomRating : Rating {
    val randomScore = Random.nextInt(0, 20)

    override fun getScore(movie: Movie): Int = randomScore

    override fun getInfoText(movie: Movie): String =
        if (getScore(movie) > 5) "Toller Film" else "Mieser Film"
}