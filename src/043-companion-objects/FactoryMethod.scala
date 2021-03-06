import com.atomicscala.AtomicTest._

class Car(val make:String) {
  override def toString(): String =  s"Car($make)"
}
object Car {
  def apply(make:String) = new Car(make)
}

val myCar = Car("Mazda")
myCar is "Car(Mazda)"
