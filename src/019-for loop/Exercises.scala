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

// 4
sum = 0
for (i <- Range(0, 11)) {
  if (i % 2 == 0) sum += i
}
sum is 30

// 5
var sumEven = 0
var sumOdd = 0
for (i <- Range(0, 11)) {
  if (i % 2 == 0) sumEven += i
  else sumOdd += i
}
sumEven is 30
sumOdd is 25
(sumEven + sumOdd) is 55
