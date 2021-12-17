package Interface

fun main(args: Array<String>) {

    val audioDownloader = Audio("bigil.mp3")
    val videoDownloader = Video("bigil.mp4")

    audioDownloader.downloaderInfo()
    audioDownloader.download()
    audioDownloader.play()

    videoDownloader.downloaderInfo()
    videoDownloader.download()
    videoDownloader.play()
}