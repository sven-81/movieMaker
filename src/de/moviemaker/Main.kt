package de.moviemaker

import com.google.gson.Gson

fun main() {
    println("Starting Game:" + System.lineSeparator())
    println(Genre.THRILLER.name)

    val emma = Actor("emma", "thompson", listOf(Genre.DRAMA, Genre.THRILLER, Genre.FANTASY))
    val steven = Director("steven", "spielberg", emma)
    val firstMovie = Movie("superfilm", steven, emma, 90000, Genre.DRAMA)

/*    println(Gson().toJson(emma))
    println(Gson().toJson(steven))
    println(Gson().toJson(firstMovie))*/

    println("${firstMovie.title}, Gesamtkosten: ${firstMovie.costs}")
}