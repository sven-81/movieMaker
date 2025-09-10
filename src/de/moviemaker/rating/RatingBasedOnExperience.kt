package de.moviemaker.rating

import de.moviemaker.Movie

class RatingBasedOnExperience : Rating {
    override fun getScore(movie: Movie): Int {
        return movie.mainActor.skill.currentSkill + movie.director.skill.currentSkill
    }

    override fun getInfoText(movie: Movie): String {
        val score = getScore(movie)

        return when {
            score > 7 -> "Toller Film"
            score > 4 -> "Mittelmäßiger Film"
            score <= 4 -> "Schlechter Film"
            else -> "Kein Kommentar"
        }
    }
}