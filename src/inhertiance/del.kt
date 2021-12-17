import kotlin.reflect.KProperty

//package Delegation
//
//import java.awt.Stroke
//
//class FileDownloader( private val file:String):Downloader{
//    override fun downloader() {
//        println("$file downloaded")
//    }
//}
//
//class FilePlayer(private val file:String):Player{
//    override fun Player() {
//        println("$file playing")
//
//    }
//
//}
//
//
//class MediaFile(
//    private val downloader: Downloader,
//    private val player: Player
//): Downloader by downloader , Player by player
//
//fun main (args: Array<String>) {
//
//    val file:String = "file1.mkv"
//    val media = MediaFile(FileDownloader(file),FilePlayer(file))
//    media.downloader()
//    media.Player()
//}


class Student{
    var firstName:String? by NameDelegate()
    var lastName:String? by NameDelegate()

    override fun toString(): String {
        return "$firstName,$lastName"
    }

}

class NameDelegate{
    var formattedValue : String?=null

    operator fun setValue (
        thisRef: Any?,
        property: KProperty<*>,
        value: String?
    ){
        if (value != null && value.length > 5){
            formattedValue =   value.trim().toUpperCase()
        }
    }

    operator fun getValue(thisRef: Any?,property: KProperty<*>): String? {
        return formattedValue
    }
    }

fun main() {
    val student = Student()
    student.firstName = "Suresh"
    student.lastName = "Balakrishnan"
    println(student)

}