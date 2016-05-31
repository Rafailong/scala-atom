import com.atomicscala.AtomicTest._

// 1
val r1 = Range(0, 10)
r1 is Range(0, 10)

// 2
val r2 = Range(0, 10).inclusive
r2 is Range(0, 11)

// 3
var sum = 0
for (i <- Range(0, 11)) {
  sum += i
}
sum is 55
