class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
//    by default compile
//    var have getter & setter
//    val only getter
    var userName: String? = null
        set(value) {
            field = value
            println("the new username is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }
}
