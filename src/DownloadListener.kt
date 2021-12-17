interface DownloadListener {

    fun onDownLoadStarted()
    fun OnDownloadCompeleted(file:String)
    fun OnProgessUpdate(progess:Int)
}