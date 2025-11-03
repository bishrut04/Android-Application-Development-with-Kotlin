package weekOne

fun main() {
    // 1. Immutable List
    val fruits = listOf<String>("apple", "banana", "cherry")
    println("Immutable List")
    for (index in fruits.indices) {
        println(index)
    }
    println("Index of apple is ${fruits.indexOf("apple")}")
    println("Item in index 1 is ${fruits[1]}")
    println("Item in index 2 is ${fruits.get(2)}")

    // 2. Mutable List
    val veggies = mutableListOf<String>("carrot", "broccoli", "spinach")
    veggies[0] = "potato"
    veggies.add("tomato")
    println("Mutable List")
    for (index in veggies.indices) {
        println(index)
    }
}
