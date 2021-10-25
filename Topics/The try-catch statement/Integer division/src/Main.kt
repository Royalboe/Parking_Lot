fun intDivision(x: String, y: String): Int {
    try {
        val result = x.toInt() / y.toInt()
        return result
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
        return 0
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
        return 0
    }
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}
