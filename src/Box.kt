class Box(
    var height:Int,
    var length:Int,
    var width:Int
) {

    init {
        println("Init Block Called")
    }

    constructor(color:String = "Red") : this(0,0,0)


    val volume
    get() = length*height*width


    var boxName :String = "Box Name"
    set(value) {
        if ( value.length< 3){
            println("Name cannot be less than 3 character")
    }else {
        field = value
    }
    }



    fun boxFilled(){
        println("Box is Filled")
    }

    fun open(){
        println("Box is Open")
    }
}



