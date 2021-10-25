fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = when (productType) {
        "headphones" -> Headphones(price)
        "tv" -> Tv(price)
        "smartphone" -> Smartphone(price)
        else -> Laptop(price)
    }
    println(totalPrice(product))
}

open class Product(val price: Int) {
    open val productTax = 1.00
}

class Headphones(price: Int) : Product(price) {
    override val productTax: Double = 11.00 / 100.00
}

class Smartphone(price: Int) : Product(price) {
    override val productTax: Double = 15.00 / 100.00
}

class Tv(price: Int) : Product(price) {
    override val productTax: Double = 17.00 / 100
}

class Laptop(price: Int) : Product(price) {
    override val productTax: Double = 19.00 / 100
}

fun totalPrice(product: Product) = (product.price + product.price * product.productTax).toInt()
