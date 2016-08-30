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

// 4
s = ""
val v3 = Vector(1, 5, 7, 8)
v3.foreach(n => s = s + s"${dogYears(n)} ")
s is "7 35 49 56 "

// 5
s = ""
v3.foreach(n => s = s + s"${n * 7} ")
s is "7 35 49 56 "

// 6
val between = (t:Int, l:Int, h:Int) => {
  l <= t && t <= h
}
between(70, 80, 90) is false
between(70, 60, 90) is true

// 7
s = ""
val v7 = Vector(1, 2, 5, 3, 7)
v7.foreach(n => s = s + s"${n * n} ")
s is "1 4 25 9 49 "
