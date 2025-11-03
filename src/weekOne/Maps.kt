package weekOne

fun main() {
    // 1. Immutable Map
    val planets = mapOf(
        "Mercury" to 1,
        "Venus" to 2,
        "Earth" to 3
    )
    println("Immutable Map Example:")
    println("Total planets listed: ${planets.size}")
    println("Position of Earth: ${planets["Earth"]}")

    // 2. Mutable Map
    val animals = mutableMapOf(
        "Dog" to 4,
        "Cat" to 4
    )
    animals["Bird"] = 2
    println("\nMutable Map Example:")
    println("Total animals listed: ${animals.size}")
    println("Legs of a bird: ${animals["Bird"]}")
}
