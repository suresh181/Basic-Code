package Interface

class Video(private val name: String): Downloader,Player {
    override fun download() {
        println("Downloaded $name")

    }

    override fun play() {
        println("Playing $name")
    }
}