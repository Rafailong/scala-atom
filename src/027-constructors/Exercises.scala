import com.atomicscala.AtomicTest._

// 3
class Tea(val name:String = "Earl Grey", val milk:Boolean = false, val sugar:Boolean = false, val decaffeinated:Boolean = false) {
  private def describeTea():String = {
    var desc = name
    if(milk) desc += " + milk"
    if(sugar) desc += " + sugar"
    if(decaffeinated) desc += " decaffeinated"
    desc
  }

  private def addCalories():Int = {
    var calories = 0
    if(milk) calories += 100
    if(sugar) calories += 16
    calories
  }

  val describe = describeTea()
  val calories = addCalories()
}

val t1 = new Tea
t1.describe is "Earl Grey"
t1.calories is 0
t1.name is "Earl Grey"

val t2 = new Tea(decaffeinated = true, name = "Lemon Zinger")
t2.describe is "Lemon Zinger decaffeinated"
t2.calories is 0
t2.decaffeinated is true

val sweetGreen = new Tea(name = "Jasmin Green", sugar = true)
sweetGreen.describe is "Jasmin Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true

val teaLatte = new Tea(sugar = true, milk = true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true