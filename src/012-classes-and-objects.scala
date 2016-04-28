/**
* Scala has the Range class http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Range
* we can have as many object of type Range.
*/
val range1 = Range(1, 10)
println(range1)

val range2 = 0 until 10
val range3 = range2.start until range2.end by range2.step + 1
println(range2, range3)

/**
* EXERCISES
*
* 1. Create a Range object and print the step value. Create a second Range object with a step
*   value of 2 and then print the step value. What's different?
*   R. The difference is the number of jump that will take the range in its value.
*/
val range4 = Range(0, 6)
println("range4 step value", range4.step)

val range5 = Range(0, 10, 2) // the step is the last params
println("range5 step value", range5.step)

val testRange = range4.start until range4.end by range5.step
assert(testRange.length == 3)

/**
* 2. Crate a String object initialized to "This is an experiment"  and call the split method
*   method on it, passing a space " " as the argument to the split method.
*/
val string1 = "This is an experiment"
println(string1)
val split = string1.split(" ")
assert(split.length == 4)

/**
* 3. Create a String object s1 as a ver initialized to "Sally". Create a second Strin object s2
*   initialized to "Sally". Use s1.equals(s2) to determine if the two Strings are aquivalent.
*   If they are, print "s1 and s2 are equal" otherwise "s1 and s2 are not equal".
*/
var s1 = "Sally"
var s2 = "Sally"
areEqual(s1, s2)

/**
* 4. Building from Exercise 3, set s2 to "Sam". Do the strings match?
*   If they match, print "s1 and s2 are equal" otherwise "s1 and s2 are not equal".
*   Is s1 still set to "Sally"?
*/
s2 = "Sam"
areEqual(s1, s2)
assert(s1 == "Sally")

def areEqual(s1:String, s2:String):Unit = {
  if (s1.equals(s2)) {
    println("s1 and s2 are equal")
  } else {
    println("s1 and s2 are not equal")
  }
}