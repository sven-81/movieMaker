package main.kotlin.de.moviemaker.comment

class MaxLength(val max: Int, val decoratedComment: Comment) : Comment {
    override fun goodMovie(): String = decoratedComment.goodMovie().substring(0, max)

    override fun badMovie(): String = decoratedComment.badMovie().substring(0, max)
}