package `lazy delg`

sealed class Data  {

    data class Success(val data: String):Data()
    data class Error(val data: String):Data()
    object Loading : Data()
}

fun getData():Data{
    return Data.Success((100..1000).random().toString())

}

fun main(){
    val data = getData()
    when(data){
        is Data.Success ->{
            println(data)
        }
        is Data.Error ->{
            println(data)
        }
        is Data.Loading ->{
            println(data)
        }
    }
}