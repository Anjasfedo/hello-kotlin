

fun saySomething(greeting: String, something: String) = println("$greeting $something")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Manhua")

    println(interestingThings.size)

    println(interestingThings[0])
    println(interestingThings.get(0))

//    for (interestingThing in interestingThings) {
//        println(interestingThing)
//    }

//    interestingThings.forEach { interestingThing -> println(interestingThing) }

    interestingThings.forEachIndexed { index, interestingThing -> println("$interestingThing at index $index") }
}
