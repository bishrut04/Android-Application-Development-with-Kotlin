package weekOne

fun main() {
    val city = arrayOf("kathmandu", "pokhara", "dharan", "birgunj", "bhaktapur")
    println(city[3])
    city[3] = "lalitpur"
    println(city[3])
    println(city.toList())

    // ArrayList
    val carBrand = ArrayList<String>()
    carBrand.add("Toyota")
    carBrand.add(1, "Ford")
    carBrand.add("Suzuki")
    carBrand[2] = "Mazda"
    println(carBrand)

    // arrayListOf
    val troops = arrayListOf<String>("valk", "RG", "Lumberjack", "HogRider")
    troops.add(4, "Miner")
    println(troops)
}