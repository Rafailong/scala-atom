import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
  color match {
    case "red" => "RED"
    case "blue" => "BLUE"
    case "green" => "GREEN"
    case _ => "fuck it! " + color +" ain't a color!"
  }
}

matchColor("red") is "RED"
matchColor("lol") is "fuck it! lol ain't a color!"