fun convertStringToDouble(input: String): Double {
    /**
    * It returns a double value or 0 if an exception occurred
    */
    try {
        return input.toDouble()
    } catch (e: Exception) {
        return 0.0
    }
}