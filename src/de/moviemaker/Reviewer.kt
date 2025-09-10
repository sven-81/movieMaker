package de.moviemaker

import de.moviemaker.comment.Comment
import de.moviemaker.comment.PraiseDecorator
import de.moviemaker.comment.RandomComment
import de.moviemaker.comment.StarDecorator
import de.moviemaker.rating.Rating

class Reviewer(firstName: String, lastName: String) : Person(firstName, lastName), Rating {
    private val preferredActor = GameData.getRandomActor()
    private var mood = 1

    override fun increaseSalary() {
        mood += 1
    }

    override fun getScore(movie: Movie): Int {
        val baseScore = if (movie.mainActor == preferredActor) 5 else 3
        return baseScore * mood
    }

    override fun getInfoText(movie: Movie): String {
        val comment: Comment = RandomComment()
        if (getScore(movie) > 5) {
            val decoratedComment = PraiseDecorator(comment)
            return decoratedComment.goodMovie()
        } else {
            val decoratedComment = StarDecorator("***", comment)
            return decoratedComment.badMovie()
        }
    }
}