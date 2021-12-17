package inhertiance

fun main(args: Array<String>) {

    var coffeeMachine = PeriumCoffee(10000.0,"brown")
    val info = coffeeMachine.machineInfo()
    val coffee = coffeeMachine.makeCoffee("Cappuccino")

    println(coffee)
    println(info)

    var simpleCoffee = CoffeMachine(2000.0,"Red")
    val coffee1 = simpleCoffee.makeCoffee("Coffee")
    println(coffee1)



}