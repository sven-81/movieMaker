package main.kotlin.de.moviemaker

class BasicOutput : OutputStrategy {
    override fun introduction(): String = "*** Neuer Film fertig ***"

    override fun description(movie: Movie): String =
        "Der Film ${movie.title} von ${movie.director} mit ${movie.mainActor}"

    override fun analyze(movie: Movie): String =
        if (movie.profit > 0) "Gewinn: ${movie.profit}" else "Verlust:${-movie.profit}"
}
