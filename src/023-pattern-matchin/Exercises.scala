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