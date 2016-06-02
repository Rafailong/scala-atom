import com.atomicscala.AtomicTest._

val v1 = Vector(5, 1, 2, 3, 4)
v1 is Vector(5, 1, 2, 3, 4)

v1(4) is 5

var result = 0
for (i <- v1) {
  result += i
}
result is 15

val sorted = v1.sorted
sorted.head is 1
sorted.tail is Vector(2, 3, 4, 5)

sorted.reverse is Vector(5, 4, 3, 2, 1)

// this throws
val elQuinto = v1(5)