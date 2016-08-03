import com.atomicscala.AtomicTest._

class Color(val red:Int, val green:Int, val blue:Int) {}

val c1 = new Color(red = 80, blue = 9, green = 100)
val c2 = new Color(80, green = 100, 9)

c1.green is c2.green