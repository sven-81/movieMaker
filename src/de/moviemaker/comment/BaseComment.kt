package de.moviemaker.comment

class BaseComment : Comment {
    override fun goodMovie(): String = "Ein toller Film."

    override fun badMovie(): String = "Ein mieser Film."
}