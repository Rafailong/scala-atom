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

/**
* 2. Create a method getSquareDouble that takes a Double argument and returns its square.
*/
def getSquareDouble(x:Double):Double = {
  x * x
}
val d = getSquareDouble(1.2)
assert(d == 1.44, "Expected " + 1.44 + " Got " + d)
val e = getSquareDouble(5.7)
assert(e == 32.49, "Expected " + 32.49 + " Got " + e)

/**
* 3. Create a method isArg1GreaterThanArg2 that takes two Double arguments
*   Return true if the first arg is greater than the second.
*/
def isArg1GreaterThanArg2(a:Double, b:Double):Boolean = {
  a > b
}
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(t1 == false)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2)

/**
* 4. Create a method getMe that takes a String and returns the same String
*   but all in lowecase letters.
*/
def getMe(me:String):String = { me.toLowerCase() }
val s1 = getMe("abraCadabra")
assert(s1 == "abracadabra")
val s2 = getMe("zyxwVUT")
assert(s2 == "zyxwvut")

/**
* 5. Create a method addStrings that takes two Strings as arguments
*   and returns the Strings appended.
*/
def addStrings(s1:String, s2:String):String = { s1 + s2 }
val appended1 = addStrings("abc", "def")
assert(appended1 == "abcdef")
val appended2 = addStrings("zyx", "abc")
assert(appended2 == "zyxabc")