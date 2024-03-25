interface PersonInfoProvider {
    fun printInfo(person: Person)
}

abstract class BasicInfoProvider : PersonInfoProvider

fun main() {
    val provider = BasicInfoProvider
}

