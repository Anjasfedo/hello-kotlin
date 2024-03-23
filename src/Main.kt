
fun saySomething(greeting: String, vararg somethings: String) {
    somethings.forEach { something -> println("$greeting $something") }
}

fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun main() {
    greetPerson(name = "Anjas", greeting = "Hiiii")
}
