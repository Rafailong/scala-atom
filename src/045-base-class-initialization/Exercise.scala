import com.atomicscala.AtomicTest._

class GreatApe(val weight:Double, val age:Int, val other:String = "") {
  def myWords = Vector("Roar")
}

class Bonobo(weight:Double, age:Int)
  extends GreatApe(weight, age)

class Chimpanzee(weight:Double, age:Int)
  extends GreatApe(weight, age)

class BonoboB(weight:Double, age:Int)
  extends Bonobo(weight, age)

class BonoboC(weight:Double, age:Int)
  extends BonoboB(weight, age)

def display(ape:GreatApe) = s"weight: ${ape.weight} age: ${ape.age}"

display(new GreatApe(100d, 12)) is "weight: 100.0 age: 12"
display(new Bonobo(100d, 12)) is "weight: 100.0 age: 12"
display(new Chimpanzee(100d, 12)) is "weight: 100.0 age: 12"
display(new BonoboB(100d, 12)) is "weight: 100.0 age: 12"
display(new BonoboC(100d, 22)) is "weight: 100.0 age: 22"

new Bonobo(100, 12).myWords is Vector("Roar")


class House(val address:String, val state:String, val zip:String) {
  def this(zip:String) = this("address?", "state?", zip)
  def this(state:String, zip:String) = this("address?", state, zip)
}

class Home(address:String, state:String, zip:String, val name:String, val heart:Boolean =  true)
  extends House(address, state, zip) {
    override def toString(): String = "Where the heart is"
}
val h = new Home("address", "st", "cp", "mine")
h.toString is "Where the heart is"
h.heart is true

class VacationHouse(
  state:String,
  zip:String,
  val startMonth:Int,
  val endMonth:Int)
  extends House(state, zip) {
    private def getMonthName(month:Int):String = month match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Dunno"
    }

    override def toString(): String =
      s"Rented house is $state for months of ${getMonthName(startMonth)} through ${getMonthName(endMonth)}"
}
val v = new VacationHouse("MI", "49431", 6, 8)
v is "Rented house is MI for months of June through August"
