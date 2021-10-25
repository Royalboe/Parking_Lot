// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val firstBox = Box(a, b, d)
    val secondBox = firstBox.copy(length = c)

    println(firstBox)
    println(secondBox)
}