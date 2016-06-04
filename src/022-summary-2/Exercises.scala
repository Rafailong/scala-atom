import com.atomicscala.AtomicTest._

// 1
val vectorOfChars = Vector('a', 'b', 'c')
val vectorOfInts = Vector(1, 2, 3)
val vectorOfString = Vector("a", "b", "c")

def x(v:Vector[Any]):Unit = {
  var join = ""
  v.foreach(i => join += i + " ")
  println("joined", join)
}

x(vectorOfChars.sorted)
println("min " + vectorOfChars.min)
println("min " + vectorOfChars.max)

x(vectorOfInts.sorted)
println("min " + vectorOfInts.min)
println("min " + vectorOfInts.max)

x(vectorOfString.sorted)
println("min " + vectorOfString.min)
println("min " + vectorOfString.max)