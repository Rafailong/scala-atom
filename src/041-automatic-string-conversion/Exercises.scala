import com.atomicscala.AtomicTest._

case class Bicycle(riders:Int) {
  override def toString(): String =  s"Bicycle built for $riders"
}
val for2 = Bicycle(2)
for2 is "Bicycle built for 2"
