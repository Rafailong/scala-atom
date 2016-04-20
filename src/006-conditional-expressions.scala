if(1 > 0) {
  println("It's true!")
}

// boolean expression
val r:Boolean = { 1 > 2 }
if(!r) {
  println("It's false!")
}

// the `else` stament
if(2 > 4) {
  println("2 is greater than 4")
} else {
  println("4 is greater than 2")
}

// we can have results from the if-else stament
// due to it is an expression
val x = {
  if(99 > 100) { 4 }
  else { 5 }
}
println(x)