// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    val list = listOf('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u')
    return letter in list
}
