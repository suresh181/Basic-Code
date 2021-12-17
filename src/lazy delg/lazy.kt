package `lazy delg`

import Student

class StudentHeavy {
    init {
        println("Student Heavy is Initialized")
    }



}

class Student{
    val heavy by lazy { StudentHeavy() }
}

fun main(args:Array<String>){
    val student = `lazy delg`.Student()
    student.heavy
}