interface PersonInfoProvider {
    fun printInfo(person: Person) {
        println("BasicInfoProvider")
        person.printInfo()
    }
}

class BasicInfoProvider : PersonInfoProvider {

}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}

