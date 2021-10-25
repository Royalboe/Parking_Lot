open class Tea(val cost: Int, val volume: Int) {
    override fun toString(): String {
        return "Tea{cost=$cost, volume=$volume}"
    }
}

class BlackTea(cost: Int, volume: Int): Tea(cost,volume) {
    override fun toString(): String {
        return "BlackTea{cost=$cost, volume=$volume}"
    }
}