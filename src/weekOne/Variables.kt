package weekOne

fun main() {
    var city = "London" // Mutable
    city = "Tokyo"
    println(city)

    val country = "UK" // Immutable
    // country = "Japan" // Not allowed
    println(country)
}
