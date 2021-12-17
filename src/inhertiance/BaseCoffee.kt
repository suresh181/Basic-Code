package inhertiance

abstract class BaseCoffee(

    private  var price:Double,
    private var color:String
) {

    abstract val brand : String

    abstract fun makeCoffee(types: String): String


    open fun machineInfo():String {

        return "CoffeeMachine Details:\n"+
                "Price: $price \n"+
                "Color: $color \n"


    }


}