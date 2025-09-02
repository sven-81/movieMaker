package de.moviemaker

import com.google.gson.Gson

fun main() {
    println("Starting Game:" + System.lineSeparator())
    println(Genre.THRILLER.name)

        val gameData = GameData
        val mainActor = gameData.getRandomActor()
        val director = gameData.directors.random()


  //  val mainActor = Actor("E", "T", listOf(Genre.THRILLER, Genre.DRAMA))
  //  val director = Director("S", "P", mainActor)

    val firstMovie = Movie("superfilm", director, mainActor, 90000, Genre.DRAMA)

    val output = "$mainActor hier"
    println(output)
    val output2 = "$director hier"
    println(output2)


    println(Gson().toJson(mainActor))
    println(Gson().toJson(director))

    /*    println(Gson().toJson(emma))
        println(Gson().toJson(steven))
        println(Gson().toJson(firstMovie))*/

    firstMovie.produce()
}