package `lazy delg`

data class Person(
    val id: String,
    val fname: String,
    val lname: String,
    val country: String
){

    fun getName() = "$fname $lname"
}

fun main(){
    val person = Person("1","Suresh","B","India")
    val person1 = Person("1","Suresh","B","India")

    println(person == person1)

    println(person.component1())
    println(person.component2())
    println(person.component3())
    println(person.component4())
}