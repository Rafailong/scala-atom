import com.atomicscala.AtomicTest._

// 1
val v1 = Vector(1, 2, 3, 4)
var s = ""
v1.foreach(c => s = s + c)
s is "1234"

// 2
s = ""
v1.foreach(c => s = s + c + ",")
s is "1,2,3,4,"

// 3
val dogYears = (y:Int) => y * 7
dogYears(10) is 70
