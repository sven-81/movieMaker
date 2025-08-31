package de.moviemaker

import kotlin.random.Random

class Actor(
    val firstName: String,
    val lastName: String,
    val genres: List<Genre>
) {
    var salary = Random.nextDouble(100000.0, 200000.0)
    var skill: Skill = Skill()

    fun movieSuccessfullyProduced() {
        skill.currentSkill += skill.learningSpeed
    }
}

class Director(
    val firstName: String,
    val lastName: String,
    val preferredActor: Actor
) {
    var salary = Random.nextDouble(100000.0, 200000.0)
    var skill : Skill = Skill()

    fun movieSuccessfullyProduced() {
        skill.currentSkill += skill.learningSpeed
    }
}