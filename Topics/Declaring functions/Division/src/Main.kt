// write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}

fun divide(a: Long, b: Long): Double {
    return a.toDouble() / b.toDouble()

}
