package `lazy delg`

import kotlin.properties.Delegates


class StudentHeavy {
    init {
        println("Student Heavy is Initialized")
    }



}

class Student{
    val heavy by lazy { StudentHeavy() }

    var marks:Int by Delegates.observable(50){property, oldValue, newValue ->
        println("Old Value $oldValue")
        println("new Value $newValue")
    }

    var age:Int by Delegates.vetoable(14){property, oldValue, newValue ->
        println("New age $newValue")
        println("Old age $oldValue")
         newValue >= 14

    }
}

fun main(args:Array<String>){
    val student = `lazy delg`.Student()
    student.heavy
//    student.marks = 60
//    student.marks = 80

    student.age = 13
    println(student.age)

    student.age = 15
    println(student.age)

    student.age = 12
    println(student.age)
}