package main.kotlin.de.moviemaker

import main.kotlin.de.moviemaker.rating.RandomRating
import main.kotlin.de.moviemaker.rating.Rating
import main.kotlin.de.moviemaker.rating.RatingBasedOnExperience
import main.kotlin.de.moviemaker.rating.RatingBasedOnMatchingCast

object GameData {
    var bestMovie: Movie? = null
        private set
    var moneyOnAccount: Double = 1_000_00.00

    val movies = mutableListOf<Movie>()
    val actors = mutableListOf<Actor>()
    val directors = mutableListOf<Director>()
    val genres = Genre.entries.toTypedArray()

    val ratingStrategies = mutableListOf<Rating>()
    var outputStrategy: OutputStrategy =
        SmartOutput()

    val reviewer: Reviewer by lazy {
        Reviewer(
            "Gregor",
            "Grimmig"
        )
    }

    init {
        actors.add(Actor("Emma", "Thompson", getRandomGenres()))
        actors.add(Actor("John", "Goodman", getRandomGenres()))
        actors.add(Actor("Susi", "Sonnenschein", getRandomGenres()))
        actors.add(Actor("Fridolin", "Fröhlich", getRandomGenres()))

        directors.add(Director("Steven", "Spielberg", getRandomActor()))
        directors.add(Director("Roland", "Emmerich", getRandomActor()))
        directors.add(Director("Hanna", "Heiter", getRandomActor()))
        directors.add(Director("Lars", "Leiter", getRandomActor()))

        ratingStrategies += mutableListOf(
            RatingBasedOnExperience(),
            RatingBasedOnMatchingCast(),
            RandomRating(),
            reviewer
        )

    }

    fun getRandomGenres(): List<Genre> = listOf(genres.random(), genres.random())

    fun getRandomActor(): Actor = actors.random()

    fun addMovie(movie: Movie) {
        movies.add(movie)
        println(reviewer.getInfoText(movie))

        if (movie.revenue > (bestMovie?.revenue ?: 0)) {
            bestMovie = movie
        }
    }
}