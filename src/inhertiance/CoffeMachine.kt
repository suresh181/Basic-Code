package inhertiance

class CoffeMachine(

     price:Double,
     color:String

): BaseCoffee(price,color) {
    override val brand: String
        get() = "Bru Coffe"

    override fun makeCoffee(types: String): String {

        Thread.sleep(5000)
        return "Your $types is ready"
    }

}