package main.kotlin.de.moviemaker.comment

class RandomComment : Comment {
    override fun goodMovie(): String = goodBadPairs.random().first

    override fun badMovie(): String = goodBadPairs.random().second

    companion object {
        val goodBadPairs = listOf<Pair<String, String>>(
            Pair("Ein Meisterwerk", "Eine glatte Fehlleistung"),
            Pair("Wundervoller Film", "Furchtbarer Film"),
            Pair("Ganz großartiger Film", "Ganz schlechter Film"),
            Pair("Herrliches Kinoerlebnis", "Nicht sein Geld wert")
        )
    }
}