package `lazy delg`

class Square(
    private val width: Int,
    private val height: Int,
    private var color: String? = null,
    private var text: String? = null
) {
    fun fillColor(color: String) {
        this.color = color
        println("$color Color Filled")
    }

    fun addText(text: String) {
        this.text = text
        println("\"$text\" text added")
    }

    override fun toString(): String {
        return "Square(width=$width, height=$height, color=$color text=$text)"
    }
}

fun main(){
//    var square = Square(10,30).let {
//        it.fillColor("Blue")
//        it.addText("Text in Black")
//    }
//    println(square)
//    var square = Square(10,30).run {
//        fillColor("Blue")
//        addText("Text in Black")
//    }
//    var square = Square(10,30).also {
//        it.fillColor("Blue")
//        it.addText("Text in Black")
//    }

    var square = Square(10,30).apply {
        fillColor("Blue")
        addText("Text in Black")
    }

    println(square)
}