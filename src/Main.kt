

var greeting: String? = null
const val name: String = "Anjas"

fun main() {
//    greeting = "Hello"

//    if (greeting != null) {
//        println(greeting)
//    } else {
//        println("Hi")
//    }

//    when (greeting) {
//        null -> println("Hi")
//        else -> println(greeting)
//    }

//    val greetingToPrint = if(greeting != null) greeting else "Hi"
    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}