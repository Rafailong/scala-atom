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

def test(number:Int, expected:Int):Unit = {
  val result = multiplyByTwo(number)
  assert(result == expected, "Expected " + expected + " Got " + result)
  println("result", result)
}
test(2, 4)
// test(2, 5) this throws and exception
// java.lang.AssertionError: assertion failed: Expected 5 Got 4