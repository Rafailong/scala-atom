import com.atomicscala.AtomicTest._

class Coffee( // this values are initialized before entering the class body
  val shots:Int = 2,
  val decaf:Boolean = false,
  val milk:Boolean = false,
  val toGo:Boolean = false,
  val syrup:String = ""
) {
  // then all this code is executed from top to bottom and the class args are avaible
  var result = ""
  println(shots, decaf, milk, toGo, syrup)

  def getDecaf():Unit = {
    if(toGo)
      result += "ToGoCup "
    else
      result += "HereCup "
  }

  def pourShots():Unit = {
    for(s <- 0 until shots)
      if(decaf)
        result += "decaf shot "
      else
        result += "shot "
  }

  def addMilk():Unit = {
    if(milk)
      result += "milk "
  }

  def addSyrup():Unit = {
    result += syrup
  }

  getDecaf()
  pourShots()
  addMilk()
  addSyrup()
}

val usual = new Coffee
usual.result is "HereCup shot shot "

val mocha = new Coffee(decaf = true, toGo = true, milk = true, syrup = "Chocolate")
mocha.result is "ToGoCup decaf shot decaf shot milk Chocolate"