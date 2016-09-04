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

def convertToSize(x: Any): Int = {
  x match {
    case s:String => s.size
    case p:Person => 1
    case n:Int => n
    case n:Float => scala.math.round(n)
    case _ => 0
  }
}
convertToSize(45) is 45
convertToSize("car") is 3
convertToSize("truck") is 5
convertToSize(Person("Rafa")) is 1
convertToSize(45.6F) is 46
convertToSize(Vector(1, 2, 3)) is 0

def quantify(a: Any): String = a match {
    case n:Int if (n < 100) => "small"
    case n:Int if (n >= 100 && n <= 1000) => "medium"
    case n:Int if (n > 1000) => "large"
    case n:Double if (n < 100d) => "small"
    case n:Double if (n >= 100d && n <= 1000d) => "medium"
    case n:Double if (n > 1000d) => "large"
    case _ => "😣"
  }
quantify(100) is "medium"
quantify(20.56) is "small"
quantify(10000) is "large"
quantify(-15999) is "small"
