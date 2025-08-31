package de.moviemaker

import kotlin.random.Random

class Skill {
    val maxSkill = Random.nextInt(200, 400)
    var currentSkill = Random.nextInt(100, maxSkill)
        set(value) {
            if (value > field && value <= currentSkill) {
                field = value
            }
        }
    val learningSpeed = Random.nextInt(1, 10)

    companion object {
        const val MIN_INIT = 100
        const val MAX_INIT = 200

        var highestLevel = MIN_INIT
            private set
    }
}