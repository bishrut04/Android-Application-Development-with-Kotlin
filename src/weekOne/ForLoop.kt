package weekOne

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: return println("Invalid input!")

    val sum = (1..number).sum()
    println("The sum of numbers from 1 to $number is $sum")
}
