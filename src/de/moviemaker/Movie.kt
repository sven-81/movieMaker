package de.moviemaker

class Movie(
    val title: String,
    val director: Director,
    val mainActor: Actor,
    val budget: Int,
    val genre: Genre
) {
    private val ratings = mutableListOf<Double>()

    val costs = director.salary + mainActor.salary + budget

    var revenue = 0
        private set

    fun produce() {
        println("todo produzieren")
    }

    fun rate() {
        println("todo bewerten")
    }
}