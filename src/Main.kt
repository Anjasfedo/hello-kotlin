

fun saySomething(greeting: String, somethings: List<String>) {
    somethings.forEach { something -> println("$greeting $something") }
}

fun main() {
    val interestingThings = mutableListOf("Kotlin", "Programming", "Manhua")


    interestingThings.forEach { interestingThing ->  println(interestingThing) }

    interestingThings.add("Manga")

    saySomething("Hewroo", interestingThings)

//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//
//    map.put(4, "d")
//
//    map.forEach { t, u -> println("$t -> $u") }
}
