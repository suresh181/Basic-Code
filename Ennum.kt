package `lazy delg`

interface DoColor{
    fun doColor()
}
enum class Color(val colorName:String, val colorValue:Int): DoColor {
    Red("Red", 10) {
        override fun doColor() {
            println("Color is Red")
        }
    },
    Green("Green", 20) {
        override fun doColor() {
            println("Color is Green")
        }
    },
    Blue("BLUE", 30) {
        override fun doColor() {
            println("Color is Blue")
        }
    }
}


fun main(){

    println(Color.Red.colorName)
    println(Color.Red.colorValue)
    Color.Green.doColor()
    Color.values().forEach {  println(it) }

    val color = Color.Red

    when(color) {
        Color.Red -> println("RED")
        Color.Green -> println("GREEN")
        Color.Blue ->println("BLUE")
    }
}