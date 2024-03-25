interface PersonInfoProvider {
    fun printInfo(person: Person)
}

class BasicInfoProvider : PersonInfoProvider {
    override fun printInfo(person: Person) {
        println("BasicInfoProvider")
        person.printInfo()
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}

