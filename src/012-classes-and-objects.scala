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