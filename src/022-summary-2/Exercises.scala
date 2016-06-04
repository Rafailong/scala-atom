import com.atomicscala.AtomicTest._

// 1
val vectorOfChars = Vector('a', 'b', 'c')
val vectorOfInts = Vector(1, 2, 3)
val vectorOfString = Vector("ab", "bc", "cd")

def x(v:Vector[Any]):String = {
  var join = ""
  v.foreach(i => join += i + " ")
  join
}

println(x(vectorOfChars.sorted))
println("min " + vectorOfChars.min)
println("min " + vectorOfChars.max)

println(x(vectorOfInts.sorted))
println("min " + vectorOfInts.min)
println("min " + vectorOfInts.max)

println(x(vectorOfString.sorted))
println("min " + vectorOfString.min)
println("min " + vectorOfString.max)

// 2
println("-2-")
val joined:Vector[Vector[Any]] = Vector(vectorOfChars, vectorOfInts, vectorOfString)
var joinedAsString = ""
joined.foreach(v => joinedAsString += x(v) + " ")
println(joinedAsString)