class Downloader {

    var downloadListener : DownloadListener? = null

    fun downloadFile(file: String){
        downloadListener?.onDownLoadStarted()
        for (i in 1..10){
            Thread.sleep(600)
            downloadListener?.OnProgessUpdate(i * 10)
        }

        downloadListener?.OnDownloadCompeleted(file)

    }
}