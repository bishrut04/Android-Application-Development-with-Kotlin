package weekOne

fun main() {
    // 1. Immutable set
    val colors = setOf<String>("Red", "Blue", "Green", "Red") // Duplicate ignored
//    colors.add("Yellow")
    println(colors)

    // 2. Mutable set
    val shapes = mutableSetOf<String>("Circle", "Square", "Triangle")
    shapes.add("Rectangle")
    println(shapes)

    println(setOf("Apple", "Banana", "Cherry") == setOf("Cherry", "Banana", "Apple"))
}
