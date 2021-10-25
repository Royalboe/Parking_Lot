fun parseCardNumber(cardNumber: String): Long {
    val newCardNumber = cardNumber.split(" ")
    return if (newCardNumber[0].length == 4 && newCardNumber[1].length == 4 && newCardNumber[2].length == 4 && newCardNumber[3].length == 4) {
        (newCardNumber[0] + newCardNumber[1] + newCardNumber[2] + newCardNumber[3]).toLong()
    } else {
        throw Exception("Card number is not correct")
    }
}
