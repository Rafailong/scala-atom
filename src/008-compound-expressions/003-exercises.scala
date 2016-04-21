var a = 1
var b = 5
var c = 5

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

/*
2. Adding to your solution for the previous exercise, check first to see
  if both `a` and `b` are less than or equal to `c` using a single `if` stament.
  If they are not, then check to see if either one is less than or equal to `c`.
  if you set `a` to 1, be to 5, and `c` to 5, you should see "both are!"
  If, instead, you set `b` to 6, you should see "one is and one isn't"
*/
if(a <= c && b <= c) {
  println("both are!")
} else {
  if(a <= c) { println("a is less than or equal than c") }
  if(b <= c) { println("b is less than or equal than c") }
}

b = 6
if(a <= c && b <= c) {
  println("both are!")
} else {
  if(a <= c) { println("a is less than or equal than c") }
  if(b <= c) { println("b is less than or equal than c") }
}