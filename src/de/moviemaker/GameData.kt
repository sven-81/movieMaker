package de.moviemaker

object GameData {
    val actors = mutableListOf<Actor>()
    val directors = mutableListOf<Director>()
    val genres = Genre.values()

    init {
        actors.add(Actor("Emma", "Thompson", getRandomGenres()))
        actors.add(Actor("John", "Goodman", getRandomGenres()))
        actors.add(Actor("Susi", "Sonnenschein", getRandomGenres()))
        actors.add(Actor("Fridolin", "Fröhlich", getRandomGenres()))

        directors.add(Director("Steven", "Spielberg", getRandomActor()))
        directors.add(Director("Roland", "Emmerich", getRandomActor()))
        directors.add(Director("Hanna", "Heiter", getRandomActor()))
        directors.add(Director("Lars", "Leiter", getRandomActor()))
    }

    fun getRandomGenres(): List<Genre> = listOf(genres.random(), genres.random())
    fun getRandomActor(): Actor = actors.random()
}