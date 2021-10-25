data class Box(val height: Int, val length: Int, val width: Int) {
    var size: Int = height + length + width
    override fun toString(): String {
        return "Box(height=$height, width=$width, size=$size)"
    }
}