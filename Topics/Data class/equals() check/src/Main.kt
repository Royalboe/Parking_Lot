data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }
}

fun main() {
    val a = readLine()!!
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!
    val e = readLine()!!.toInt()
    val f = readLine()!!.toInt()
    val firstClient = Client(a, b, c)
    val secondClient = Client(d, e, f)

    println(firstClient == secondClient)
}