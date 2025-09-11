package main.kotlin.de.moviemaker

class SmartOutput : OutputStrategy {
    override fun introduction(): String = "Wir präsentieren den neuesten Film."

    override fun description(movie: Movie): String = """
        ${movie.title} ist ein ${movie.genre} Film.
        In der Hauptrolle spielt ${movie.mainActor}
        Regie führte ${movie.director}
        Der Film hat ${movie.revenue} Dollar eingespielt.
        """.trimIndent()

    override fun analyze(movie: Movie): String {
        val info = StringBuilder()
        info.appendLine("Schauspieler: ${movie.mainActor}")
        info.appendLine("Bevorzugter Schauspieler: ${movie.director.preferredActor}")
        info.appendLine("Genre des Films: ${movie.genre}")
        info.appendLine("Genres des Schauspielers: ${movie.mainActor.genres}")

        val genreMatch = movie.mainActor.genres.contains(movie.genre)
        info.appendLine(if (genreMatch) "Genre passt" else "Genre passt nicht")
        info.appendLine("Ausgaben: ${movie.costs}")
        info.appendLine("Einnahmen: ${movie.revenue}")

        return info.toString()
    }
}