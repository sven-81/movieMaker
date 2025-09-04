package de.moviemaker

import kotlin.random.Random

class Movie(
    val title: String,
    val director: Director,
    val mainActor: Actor,
    val budget: Int,
    val genre: Genre
) {
    private val ratings = mutableListOf<Double>()
    val costs: Double = (director.salary + mainActor.salary + budget).toDouble()

    var revenue = 0
        private set

    var profit = 0
        private set

    fun format(double: Double): String = "%.2f".format(double)

    fun produce() {
        println("Produziere: $title, Gesamtkosten: ${format(costs)}")

        val baseRevenue = Random.nextInt(1_000_000, 2_000_000)

        rate()

        var totalRevenue = 0
        for (rating in ratings) {
            val additionalRevenue = (baseRevenue * rating).toInt()
            totalRevenue += additionalRevenue
            println("Film wurde bewertet mit ${format(rating)} Punkten. Einnahmen: $additionalRevenue")
        }

        this.revenue = totalRevenue
        println("Gesamteinnahmen des Films: $revenue")

        val profit = revenue - costs
        if (profit >= 0){
            println("Gewinn: ${format(profit)}")
        } else {
            println("Verlust: ${format(-profit)}")
        }

        mainActor.movieSuccessfullyProduced()
        director.movieSuccessfullyProduced()
    }

    fun rate() {
        for (x in 1..5) {
            val rating = Random.nextDouble(0.0, 5.0)
            ratings.add(rating)
        }
    }
}