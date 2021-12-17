package `lazy delg`

class Box(val length:Int, val width:Int, val height:Int) {

    inner class Content(val content:String){
        fun printBoxInfo(){
            println("$length,$width,$height")
        }

        fun printContent(){
            println(content)
        }
    }
}

fun main(args:Array<String>){
    val box = Box(10,10,10)
    val content = box.Content("Hello all ")
    content.printContent()
    content.printBoxInfo()
}