package de.moviemaker

import com.google.gson.Gson

fun main() {
    println("Starting Game:" + System.lineSeparator())
    println(Genre.THRILLER.name)

    val gameData = GameData
    val mainActor = gameData.getRandomActor()
    val director = gameData.directors.random()
    val firstMovie = Movie("superfilm", director, mainActor, 90000, Genre.DRAMA)

    println(Gson().toJson(mainActor))
    println(Gson().toJson(director))

    /*    println(Gson().toJson(emma))
        println(Gson().toJson(steven))
        println(Gson().toJson(firstMovie))*/

    firstMovie.produce()
}