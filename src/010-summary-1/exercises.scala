//Work exercises 1-8 in the REPL

// 1. Store an Int value.

val one:Int = 1

// 2. Tryt o change the value. What happened?
// this will throw a reassignment error
// one = 2

// 3. Create a var and init it to and Int, then try
//  reassigning to a Double. What happened?
var two:Int = 2

// this will throw a type mismatch error
// two = 2.0

// 4. Store two Double, one using type inference and another one
//   declaring the type.
val doubleOne = 1.0
val doubleTwo:Double = 2
println(doubleOne, doubleTwo)

// 5. What happens if you try to store the number 15 in a Dooble val?
//   It is treated as double
val quince:Double = 15
println(quince)

// 6. Save and print a multiline String
val multilineString = """this
is a multiline
String
"""
println(multilineString)

// 7. What happens if you try to store the String "maybe" in a Boolean?
//   A type mismatch error is thrown
// val bool:Boolean = "maybe"


// 8. What happens if you try to store the number 15.4 in an Int?
// val x:Int = 15.4
// A type mismatch error is thrown