import com.atomicscala.AtomicTest._

val v = Vector(1, 10, 100, 1000)
val sum = v.reduce((sum, n) => sum + n)
sum is 1111
