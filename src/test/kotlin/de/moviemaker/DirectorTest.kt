package test.kotlin.de.moviemaker

import main.kotlin.de.moviemaker.Actor
import main.kotlin.de.moviemaker.Director
import main.kotlin.de.moviemaker.Genre
import org.junit.jupiter.api.BeforeEach

class DirectorTest {

    private lateinit var director: Director

    @BeforeEach
    fun setUp() {
        director = Director(
            "Quentin", "Tarantino",
            Actor("Christoph", "Waltz", listOf(Genre.ACTION, Genre.DRAMA))
        )
        director.salary = 1000
        director.skill.currentSkill = (director.skill.maxSkill * 0.81).toInt()
    }

    @Test
    fun testToString() {
        val expected = "Regisseur: Quentin Tarantino"
        assertEquals(expected, director.toString())
    }

    @Test
    fun testIncreaseSalary() {
        director.increaseSalary()
        assertEquals(1100, director.salary)
    }
}