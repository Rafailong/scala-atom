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

private def quantifyH(a: Double): String = a match {
    case n if (n < 100d) => "small"
    case n if (n >= 100d && n <= 1000d) => "medium"
    case n if (n > 1000d) => "large"
  }

def quantify(a: Any): String = a match {
    case n:Int => quantifyH(n)
    case n:Double => quantifyH(n)
    case _ => "😣"
  }
quantify(100) is "medium"
quantify(20.56) is "small"
quantify(10000) is "large"
quantify(-15999) is "small"
quantify(true) is "😣"

def forecast(percent:Int):String = {
  percent match {
    case p if 81 to 100 contains p => "Sunny"
    case p if 51 to 80  contains p => "Mostly Sunny"
    case p if 21 to 50  contains p => "Partly Sunny"
    case p if 1  to 20  contains p => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}
forecast(100) is "Sunny"
forecast(81) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(51) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(21) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(1) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(-1) is "Unknown"
