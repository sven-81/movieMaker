package main.kotlin.de.moviemaker

class DummyOutput : OutputStrategy {
    override fun introduction(): String = "Tada!"
    override fun description(movie: main.kotlin.de.moviemaker.Movie): String = "Fertig."
    override fun analyze(movie: main.kotlin.de.moviemaker.Movie): String = "Statistikausgabe-Platzhalter"
}
