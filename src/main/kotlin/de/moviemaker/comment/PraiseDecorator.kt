package main.kotlin.de.moviemaker.comment

class PraiseDecorator(val decoratedComment: Comment) : Comment by decoratedComment {
    private val praise = listOf("Wow!", "Super!", "Klasse!", "yay!")
    override fun goodMovie(): String = "${praise.random()} ${decoratedComment.goodMovie()}"
}