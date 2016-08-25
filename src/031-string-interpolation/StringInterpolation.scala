import com.atomicscala.AtomicTest._

def interpolate(s:String, i:Int, d:Double):String =
  s"first: $s second: $i third: $d"

interpolate("hi", 1, 3.1416) is "first: hi second: 1 third: 3.1416"