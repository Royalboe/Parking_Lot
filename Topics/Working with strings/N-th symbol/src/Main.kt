fun main() {
    // write your code here
    val string = readLine()!!
    val int = readLine()!!.toInt()
    println("Symbol # $int of the string \"$string\" is \'${string[int - 1]}\'")
}