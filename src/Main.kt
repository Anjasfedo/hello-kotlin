
fun saySomething(greeting: String, vararg somethings: String) {
    somethings.forEach { something -> println("$greeting $something") }
}

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Manhua")

    saySomething("Hewrooow", *interestingThings)
}
