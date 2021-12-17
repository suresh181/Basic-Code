fun main(args: Array<String>){

    val box1 = Box()
    val box2 = Box()
    val box3 = Box()

    box1.height = 10
    box2.height = 10
    box3.height = 10

    println("Height of box1 ${box1.height},Length of the box1 ${box1.length},Width of the box1 ${box1.width}")
    println("Height of box2 ${box2.height},Length of the box2 ${box2.length},Width of the box2 ${box2.width}")
    println("Height of box3 ${box3.height},Length of the box3 ${box3.length},Width of the box3 ${box3.width}")

    println("Volume : ${box1.volume}")


    box1.boxName = "My Box"
    println("Box Name${box1.boxName}")
    box1.open()
    box1.boxFilled()
}