

fun saySomething(greeting: String, something: String) = println("$greeting $something")

fun main() {
    val interestingThings = listOf("Kotlin", "Programming", "Manhua")

    interestingThings.forEach { interestingThing -> println(interestingThing) }
}
