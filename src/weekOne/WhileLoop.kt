package weekOne

fun main() {
    print("Enter a positive number: ")
    val number = readLine()?.toIntOrNull() ?: return println("Invalid input!")

    var i = 1
    println("Counting from 1 to $number:")
    while (i <= number) {
        println(i)
        i++
    }
}
