package de.moviemaker


class Director(
    firstName: String,
    lastName: String,
    val preferredActor: Actor
) : Person(firstName, lastName) {
    override fun toString(): String {
        return "Regisseur: ${super.toString()}"
    }

    override fun movieSuccessfullyProduced(){
        if (skill.currentSkill < skill.maxSkill) {
            skill.currentSkill += 1
        }
    }
}