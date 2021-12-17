package `lazy delg`

fun String.getAllwWords(): List<String> {
    return this.split("")
}

 fun main(){
     val a:String = "How all "
     val word = a.getAllwWords()
     println(word)
}