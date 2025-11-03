package weekOne


fun main() {
    print("Enter a number to find its factorial: ")
    val number = readLine()?.toIntOrNull()

    if (number == null || number < 0) {
        println("Invalid input. Please enter a positive integer.")
        return
    }

    var factorial = 1L
    var i = 1

    do {
        factorial *= i
        i++
    } while (i <= number)

    println("The factorial of $number is $factorial")
}
