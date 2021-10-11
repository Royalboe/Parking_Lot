fun main() {
    val input = readLine()!!
    if (input.isEmpty()) println("") else {
        when (input.first()) {
            'i' -> {
                val input2 = input.drop(1)
                val input3 = input2.toInt()
                println(input3 + 1)
            }
            's' -> {
                val input2 = input.drop(1)
                val input3 = input2.reversed()
                println(input3)
            }
            else -> println(input)
        }
    }
}
