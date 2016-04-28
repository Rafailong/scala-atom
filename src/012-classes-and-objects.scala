/**
* Scala has the Range class http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Range
* we can have as many object of type Range.
*/
val range1 = Range(1, 10)
println(range1)

val range2 = 0 until 10
val range3 = range2.start until range2.end by range2.step + 1
println(range2, range3)
