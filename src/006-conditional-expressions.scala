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

/* Exercises

1. Set the values a and b to 1 and 5, respectively. Write a conditional
  expression that checks to see if a is less than b. Print “a is less than
  b” or “a is not less than b.”
*/
val a = 1
val b = 5
val c = 5
if(a < b) {
  println("a is less than b")
}
else {
  println("a is not less than b")
}

/*
2. Using a and b, above, write some conditional expressions to check
  if the values are less than 2 or greater than 2. Print the results.
*/
if(a < 2) {
  println("a is less than 2")
}
else {
  println("a is not less than 2")
}

if(b < 2) {
  println("b is less than 2")
}
else {
  println("b is not less than 2")
}

/*
3. Set the value c to 5. Modify the first exercise, above, to check if
  a < c. Then, check if b < c (where ‘<’ is the less-than operator).
  Print the results.
*/
if(a < c) {
  println("a is less than c")
  if(b < c) { println("b is less than c") }
  else { println("b is not less than c") }
}
else {
  println("a is not less than b")
}