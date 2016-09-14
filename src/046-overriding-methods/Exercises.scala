import com.atomicscala.AtomicTest._

/**
 * 1
 * the method eat at GreatApe3 is defined with parens du to
 * is modifies the inner state of the object.
 */

// 2
class GreatApe(val weight:Double, val age:Int, val other:String = "") {
  def myWords = Vector("Roar")
}
class Bonobo(weight:Double, age:Int)
  extends GreatApe(weight, age) {

  override def myWords = super.myWords :+ "Hello"
}
val ape = new GreatApe(112, 9)
ape.myWords is Vector("Roar")
val bonobo = new Bonobo(150, 14)
bonobo.myWords is Vector("Roar", "Hello")

// 3
class Trip(
  val origination:String,
  val destination:String,
  val startDate:String,
  val endDate:String) {
    override def toString(): String =
      s"From $origination to $destination: $startDate to $endDate"
  }
val t = new Trip("Detroit", "Houston", "5/1/2012", "6/1/2012")
t is "From Detroit to Houston: 5/1/2012 to 6/1/2012"

class AirplaneTrip(origination:String, destination:String, startDate:String, endDate:String, val movie:String)
  extends Trip(origination, destination, startDate, endDate) {

  override def toString(): String = {
    super.toString + s", we watched $movie"
  }
}
val a = new AirplaneTrip("Detroit", "Houston", "5/1/2012", "6/1/2012","Superman")
a is "From Detroit to Houston: 5/1/2012 to 6/1/2012, we watched Superman"

class CarTrip(startDate:String, endDate:String, val cities:Vector[String])
  extends Trip(cities.head, cities.last, startDate, endDate)
val cities = Vector("Boston", "LA", "San Francisco")
val c = new CarTrip("6/1/2012", "7/1/2012", cities)
c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"
c is "From Boston to San Francisco: 6/1/2012 to 7/1/2012"
