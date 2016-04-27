/**
* The methods in Scala are defined as follow
*
* def methodName(arg1:Type, arg2:Type, ...):ReturnType = {
*   lines of code
* }
*
* A method body is an expression!
*/

def multiplyByTwo(number:Int):Int = {
  number * 2
}
println("10 multiply by two is ", multiplyByTwo(10))

// the tests methods do not return a value
def test(number:Int, expected:Int):Unit = {
  val result = multiplyByTwo(number)
  assert(result == expected, "Expected " + expected + " Got " + result)
  println("result", result)
}
test(2, 4)
// java.lang.AssertionError: assertion failed: Expected 5 Got 4
// test(2, 5) this throws and exception


/**
* EXERCISES
*
* 1. Create a method getSquare that takes and Int argument and returns its square.
*/
def getSquare(x:Int):Int = {
  x * x
}
val a = getSquare(3)
assert(a == 9, "Expected " + 9 + " Got " + a)
val b = getSquare(6)
assert(b == 36, "Expected " + 36 + " Got " + b)
val c = getSquare(5)
assert(c == 25, "Expected " + 25 + " Got " + c)