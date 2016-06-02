import com.atomicscala.AtomicTest._


// 3
var setence = ""
val v1 = Vector("The", "dog", "visited", "the", "firehouse!")
for(s <- v1) {
  println(s)
  setence += s + " "
}
setence is "The dog visited the firehouse! "

// 4
setence.replace("firehouse! ", "firehouse!") is "The dog visited the firehouse!"


// 5
for(s <- v1) {
  println(s.reverse)
}

// 6
for(i <- setence.split(" ").reverse) {
  println(i)
}

// 7
val vI = Vector(1, 2, 3)
val vD = Vector(1.5, 2.5, 3.5)

vI.min is 1
vI.max is 3
vI.sum is 6

vD.min is 1.5
vD.max is 3.5
vD.sum is 7.5

// 11
val l1 = List("word", "lol", "rofl")
val s1 = Set("I", "am", "learning")

println(l1.reverse)
println(l1.sorted)

// the Set object does not contains these methods
// println(s1.reverse)
// println(s1.sorted)

// 12
val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)
myVector1 is myVector2 // EQUAL compare de elements in the init order