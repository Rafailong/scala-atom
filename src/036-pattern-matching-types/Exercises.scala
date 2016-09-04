import com.atomicscala.AtomicTest._

case class Person(name:String)

def plus1(arg: Any): Any = {
  arg match {
    case p:Person => s"$p + guest"
    case s:String => s"${s}s"
    case i:Int => i + 1
    case _ => "😣"
  }
}
plus1(67) is 68
plus1("car") is "cars"
plus1(Person("Rafa")) is "Person(Rafa) + guest"
