val a = 1
val b = 5
val c = 5

/*
1. In Exercise 3 of 006-conditional-expression, you checked to see if
  `a` was less than `c`, and then `b` less than `c`. Repeat that exercise
  but this time use less than or equal.
*/
if(a <= c) {
  println("a is less than or equal than c")
  if(b <= c) { println("b is less than or equal than c") }
  else { println("b is not less than or equal than c") }
}
else {
  println("a is not less than or equal than b")
}