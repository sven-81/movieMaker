package de.moviemaker.comment

class StarDecorator(val stars: String, val base: Comment) : Comment {
    override fun goodMovie(): String = stars + base.goodMovie() + stars

    override fun badMovie(): String = stars + base.badMovie() + stars
}