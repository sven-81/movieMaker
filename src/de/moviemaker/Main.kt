package de.moviemaker

fun main() {
    println("Starting Game:" + System.lineSeparator())

    var lastMovie: Movie? = null

    fun format(double: Double): String = "%.2f".format(double)

    gameloop@ do {
        if (lastMovie != null) {
            println("Letzter Film: ${lastMovie.title}")
        }

        println(System.lineSeparator() + "Ihr Vermögen: ${format(GameData.moneyOnAccount)}")
        println("p=Film produzieren *** s=Statistik *** q=Quit")

        val input = readlnOrNull() ?: "none"
        when (input.lowercase()) {
            "p" -> {
                lastMovie = produceNewMovie()
                GameData.addMovie(lastMovie)
            }

            "s" -> statistics(lastMovie)
            "q" -> break@gameloop
        }
    } while (true)
}

fun statistics(movie: Movie?) {
    println("Statistik")
    println("Bester Film: ${GameData.bestMovie?.title ?: "Keiner!"}")

    if (movie != null) {
        println(movie.title)
        println("Einnahmen: ${movie.revenue}")
        println("Ausgaben: ${movie.costs}")
        println("Gewinn: ${movie.profit}")
    }
}

fun produceNewMovie(): Movie {
    println("Neuen Film produzieren.")
    println("Titel eingeben:")

    val title = readlnOrNull() ?: "Kein Titel"
    val actor = chooseActor()
    val director = chooseDirector()
    val genre = chooseGenre()

    println("Bitte Budget eingeben:")

    val budget = try {
        readlnOrNull()?.toInt() ?: 0
    } catch (exception: NumberFormatException) {
        100_000
    }

    val movie = Movie(title, director, actor, budget, genre)
    movie.produce()

    GameData.moneyOnAccount += movie.profit

    return movie
}

fun chooseActor(): Actor {
    println("Bitte wähle einen Schauspieler")
    return choosePerson(GameData.actors) as Actor
}

fun chooseDirector(): Director {
    println("Bitte wähle einen Regisseur")
    return choosePerson(GameData.directors) as Director
}

fun choosePerson(personList: List<Person>): Person {
    for ((index, person) in personList.withIndex()) {
        println("$index = $person Gehalt: ${person.salary}")
    }
    var choice: Int? = null
    do {
        val input = readln()
        try {
            choice = input.toInt()
        } catch (exception: Exception) {
            println("Bitte gib eine gültige Nummer ein.")
        }
    } while (choice == null || choice !in personList.indices)
    return personList[choice]
}

fun chooseGenre(): Genre {
    val genres = GameData.genres
    println("Bitte wähle ein Genre")

    for ((index, genre) in genres.withIndex()) {
        println("$index = $genre")
    }

    return try {
        val i = readlnOrNull()?.toInt() ?: 0
        genres[i]
    } catch (exception: Exception) {
        GameData.getRandomGenres()
    } as Genre
}


