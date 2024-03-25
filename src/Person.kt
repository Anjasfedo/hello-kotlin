class Person(private val firstName: String = "Peter", private val lastName: String = "Parker") {
//    by default compile
//    var have getter & setter
//    val only getter
    protected var userName: String? = null
        set(value) {
            field = value
            println("the new username is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    internal fun printInfo() {
//        val usernameToPrint = if (userName != null) userName else "no username"
        val usernameToPrint = userName ?: "no username"

        println("$firstName ($usernameToPrint) $lastName")
    }
}
