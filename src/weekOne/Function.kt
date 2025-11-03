package weekOne

fun main(){
    println("The sum of 2 numbers = ${add(5,6)}")
    println("The difference of 2 numbers = ${sub(5,6)}")
}
fun add(a:Int, b: Int):Int {
    return a + b;
}
fun sub(a:Int, b: Int):Int{
    return a-b;
}
