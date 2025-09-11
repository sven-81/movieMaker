package main.kotlin.de.moviemaker

class Actor(
    firstName: String,
    lastName: String,
    val genres: List<Genre>
) : Person(firstName, lastName) {

    override fun toString(): String {
        return "Schauspieler*in: ${super.toString()}"
    }

    override fun movieSuccessfullyProduced() {
        super.movieSuccessfullyProduced()

        if (skill.currentSkill > skill.maxSkill * 0.8) {
            salary += 20000
        }
    }

    override fun increaseSalary(){
        salary = (salary *1.1).toInt()
    }
}