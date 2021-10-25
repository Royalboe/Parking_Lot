fun main() {
    val firstInt = readLine()!!.toInt()
    val secondInt = readLine()!!.toInt()
    
    if (secondInt == 0) {
        println("Division by zero, please fix the second argument!")
    } else {
        println(firstInt / secondInt)
    }
}
