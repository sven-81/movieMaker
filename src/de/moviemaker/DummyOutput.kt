package de.moviemaker

class DummyOutput : OutputStrategy {
    override fun introduction(): String = "Tada!"
    override fun description(movie: Movie): String = "Fertig."
    override fun analyze(movie: Movie): String = "Statistikausgabe-Platzhalter"
}
