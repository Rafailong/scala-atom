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

// 3
def checkTruth(a:Boolean, b:Boolean):String = {
  (a, b) match {
    case (true, true) => "Both are true"
    case (true, false) => "First is true, second is false"
    case (false, true) => "First is false, second is true"
    case _ => "Both are false"
  }
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First is true, second is false"
checkTruth(1 >= 2, 1>= 1) is "First is false, second is true"
checkTruth(true && false, false && true) is "Both are false"

// 4
def forecast(percent:Int):String = {
  percent match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"