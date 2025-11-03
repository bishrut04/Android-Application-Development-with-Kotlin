package weekOne


fun main() {
    print("Enter any number: ")
    val number = readLine()?.toLongOrNull()

    if (number == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    if (number > 0) {
        println("The number $number is Positive")
    } else if (number < 0) {
        println("The number $number is Negative")
    } else {
        println("The number $number is Zero")
    }

    println("And")

    if (number % 2L == 0L) {
        println("The number $number is Even")
    } else {
        println("The number $number is Odd")
    }
}
