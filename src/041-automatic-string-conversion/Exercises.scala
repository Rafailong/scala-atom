import com.atomicscala.AtomicTest._

case class Cycle(wheels:Int) {
  override def toString(): String =  {
    wheels match {
      case 1 => "Unicycle"
      case 2 => "Bicycle"
      case _ => s"Cycle with $wheels wheels"
    }
  }
}
var uni = Cycle(1)
uni is "Unicycle"

val for2 = Cycle(2)
for2 is "Bicycle"

val five = Cycle(5)
five is "Cycle with 5 wheels"
