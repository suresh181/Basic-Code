package `lazy delg`

fun main() {
//
//    val names = listOf<String>("Suresh","Abhishek","Suji")

//    val names = mutableListOf<String>("Suresh")
//    names.add("Abhishek")
//    names.add("Suji")
//    println(names[0])
//    println(names[2])
//    println(names[1])
//
//    for (n in names){
//        println(n)
//    }
//
//    names.forEach{ println(it)}
//
//    val names = mutableSetOf<String>("Suresh","Suresh", "Abhishek","Abhishek","Suji")
//
//    names.add("Bala")
//    names.add("Nagam")
//    names.remove("Suresh")
//    names.forEach { println(it) }

    val student = mutableMapOf<Int,String>(1 to "Suresh",2 to "Abhishek",3 to "Suji")

    student.remove(1)
    println(student[2])
    student[1]= "Nagam"

    student.forEach { t, u ->

        println("$t and $u")
    }
}