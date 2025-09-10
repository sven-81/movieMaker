package de.moviemaker.rating

import de.moviemaker.Movie

class RatingBasedOnMatchingCast : Rating {
    override fun getScore(movie: Movie): Int {
        var score = 0

        if (movie.mainActor.genres.contains(movie.genre)) {
            score += 5
        }
        if (movie.director.preferredActor == movie.mainActor) {
            score += 5
        }
        return score
    }
}