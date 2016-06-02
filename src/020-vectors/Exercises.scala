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
