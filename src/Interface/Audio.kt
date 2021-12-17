package Interface

class Audio( private val name:String):Downloader,Player {
    override fun download() {
        println("Downloaded $name")
    }

    override fun play() {
        println("Playing $name")

    }
}