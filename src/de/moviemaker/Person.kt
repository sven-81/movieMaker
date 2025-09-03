package de.moviemaker

import kotlin.random.Random

abstract class Person(
    val firstName: String,
    val lastName: String
) {
    var salary = Random.nextInt(100_000, 2_000_000)
    val skill = Skill()

    open fun movieSuccessfullyProduced() {
        skill.currentSkill += skill.learningSpeed
    }

    open fun movieSuccessfullyProduced(rating: Double) {
        skill.currentSkill += (skill.learningSpeed * rating).toInt()
    }

    override fun toString(): String {
        return "$firstName $lastName"
    }

    abstract fun increaseSalary()
}