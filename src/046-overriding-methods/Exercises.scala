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
