fun printFifthCharacter(input: String): String {
    try {
        return "The fifth character of the entered word is ${input[4]}"
    } catch (e: StringIndexOutOfBoundsException) {
        return "The input word is too short!"
    }

}