/*
A statement change state (produce side effects)
A expression expresses
So, everything in Scala is an expression
*/

// use curly braces to surround multiple expression 
val c = {
  // we can use semicolons to get more than 1 expression in a single line
  val x = 2; val y = 4/x
  x * y
}
println(c)

// we also have expression that do not return a value
val e = println("void in other languages")
println(e)
println({}) // this is Unit too

// exercises solution
val result = {
  val feetPerMile = 5280
  val yardsPerMile = feetPerMile / 3.0
  2000 / yardsPerMile
}
println(result)