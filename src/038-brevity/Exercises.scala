import com.atomicscala.AtomicTest._

def assignResult(arg:Boolean) = if (arg) 42 else 47

assignResult(true) is 42
assignResult(false) is 47

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

  def getDecaf() {
    if(toGo)
      result += "ToGoCup "
    else
      result += "HereCup "
  }

  def pourShots() {
    for(s <- 0 until shots)
      if(decaf)
        result += "decaf shot "
      else
        result += "shot "
  }

  def addMilk() {
    if(milk)
      result += "milk "
  }

  def addSyrup() {
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
