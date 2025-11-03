package weekOne

fun main() {
    val age = 25
    val isTeenager = age in (13..19) // Checks if age is between 13 and 19
    println("Is teenager? $isTeenager")

    // When statement example
    val fruit = "Apple"
    when (fruit) {
        "Banana" -> println("The fruit is Banana")
        "Apple" -> println("The fruit is Apple")
        else -> println("Fruit not found")
    }
}
