import com.atomicscala.AtomicTest._

def test(tuple:(Int, String, String)) {
  val (temp1, sky1, view1) = tuple
  temp1 is tuple._1
  sky1 is tuple._2
  view1 is tuple._3
}

test((65, "Sunny", "Stars"))
test((78, "Cloudy", "Satellites"))
test((51, "Blue", "Night"))


val info = (50, 45)
info._1 is 50
info._2 is 45


def weather(temperature:Int, humidity:Int):(String, String) = {
  val tempS = temperature match {
    case t if (t > 80) => "Hot"
    case t if (t < 50) => "Cold"
    case _ => "Temperate"
  }
  val humS = humidity match {
    case h if (h > 40 && temperature >= 50) => "Humid"
    case h if (h > 40) => "Damp"
    case _ => "Pleasant"
  }
  (tempS, humS)
}
weather(81, 45) is ("Hot", "Humid")
weather(50, 45) is ("Temperate", "Humid")
weather(40, 50) is ("Cold", "Damp")
weather(30, 35) is ("Cold", "Pleasant")


val (heat1, moisture1) = weather(81, 45)
heat1 is "Hot"
moisture1 is "Humid"
val (heat2, moisture2) = weather(27, 55)
heat2 is "Cold"
moisture2 is "Damp"
