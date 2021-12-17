package inhertiance

class PeriumCoffee(
    private  var price:Double,
    private var color:String
): BaseCoffee(price,color) {


    override val brand: String
        get() = "NesCafe Gold"

    override fun makeCoffee(types: String): String {
        return "Your $types ☕ is ready"
    }
}