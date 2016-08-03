import com.atomicscala.AtomicTest._

class Color(val red:Int = 100, val green:Int = 100, val blue:Int = 100)

(new Color(20)).green is 100
(new Color(20, 17)).blue is 100
(new Color(blue = 20)).red is 100
(new Color(red = 11, green =  42)).blue is 100