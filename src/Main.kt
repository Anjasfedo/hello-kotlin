
fun saySomething(greeting: String, vararg somethings: String) {
    somethings.forEach { something -> println("$greeting $something") }
}

fun greetPerson(greeting: String = "Hewrooo", name: String) = println("$greeting $name")

fun main() {
    val person = Person()

    println(person.firstName)
    println(person.lastName)
}
