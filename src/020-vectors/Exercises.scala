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