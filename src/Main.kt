
fun getGreeting() = "Hello Kotlin"

fun sayHello() {
    println(getGreeting())
}

fun saySomething(greeting: String, something: String) = println("$greeting $something")

fun main() {
    println("Hello Kotlin")

    println(getGreeting())

    sayHello()

    saySomething("Hewro", "World")
}
