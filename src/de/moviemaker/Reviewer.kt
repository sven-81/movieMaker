package de.moviemaker

class Reviewer(firstName: String, lastName: String) : Person(firstName, lastName), Rating {
    private val preferredActor = GameData.getRandomActor()
    private var mood = 1

    override fun increaseSalary() {
        mood += 1
    }

    override fun getScore(movie: Movie): Int {
        val baseScore = if (movie.mainActor == preferredActor) 5 else 3
        return baseScore * mood
    }

    override fun getInfoText(movie: Movie): String =
        if (getScore(movie) > 5) "Toller Film" else "Mieser Film"
}