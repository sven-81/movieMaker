package test.kotlin.de.moviemaker

import main.kotlin.de.moviemaker.Actor
import main.kotlin.de.moviemaker.Genre
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ActorTest {

    private lateinit var actor: Actor

    @BeforeEach
    fun setUp() {
        actor = Actor("bruce", "willis", listOf(Genre.ACTION, Genre.DRAMA))
        actor.salary = 1000
        actor.skill.currentSkill = (actor.skill.maxSkill * 0.81).toInt()
    }

    @Test
    fun testToString() {
        val expected = "Schauspieler*in: bruce willis"
        assertEquals(expected, actor.toString())
    }

    @Test
    fun testIncreaseSalary() {
        actor.increaseSalary()
        assertEquals(1100, actor.salary)  // 50000 * 1.1
    }

    @Test
    fun testGenres() {
        assertTrue(actor.genres.contains(Genre.ACTION))
        assertTrue(actor.genres.contains(Genre.DRAMA))
    }

}