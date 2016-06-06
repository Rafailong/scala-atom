import com.atomicscala.AtomicTest._

// 1
def matchColor(color:String):String = {
  if (color == "red") "RED"
  else if (color == "green") "GREEN"
  else if (color == "blue") "BLUE"
  else "fuck it! " + color + " ain't a color"
}

matchColor("white") is "fuck it! white ain't a color"
matchColor("blue") is "BLUE"

// 2
def oneOrTheOther(exp:Boolean):String = {
  exp match {
    case true => "true"
    case _ => "false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)

oneOrTheOther(v == v.reverse) is "true"
oneOrTheOther(v2 == v2.reverse) is "false"