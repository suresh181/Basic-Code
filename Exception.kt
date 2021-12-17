package `lazy delg`

class IllegalException(message:String):Exception(message)

fun vote (name:String,age:Int){
    if (age<18)
        throw IllegalException("You cannot vote because your under 18yrs")
    println("$name is voted")

}

fun main(){

    try {

        vote("Suresh",17)

    }catch (e:IllegalException){
        e.printStackTrace()
    }finally {
        println("Finally prints")
    }


    val a = 10
    val b = 0

    val result = try {
        println(a / b)
    }catch (e:Exception){
        println("Catch Block Initialized")
        0
    }
    println("Result is $result")
}