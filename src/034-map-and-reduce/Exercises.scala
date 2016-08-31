import com.atomicscala.AtomicTest._

// 1
val v = Vector(1, 2, 3, 4)
val vR = v.map(n => (n * 11) + 10)
vR is Vector(21, 32, 43, 54)

// 2
var set = scala.collection.mutable.Set[Int]()
v.foreach(n => set += (n * 11) + 10)
set.toVector.sorted is Vector(21, 32, 43, 54)

 // 3
var set2 = scala.collection.mutable.Set[Int]()
for (i <- v) {
  set2 += (i * 11) + 10
}
set2.toVector.sorted is Vector(21, 32, 43, 54)

// 4
var set3 = scala.collection.mutable.Set[Int]()
for (i <- v) {
  set3 += i + 1
}
set3.toVector.sorted is Vector(2, 3, 4, 5)

// 5
val v2 = Vector(1, 10, 100, 1000)
var sum = 0
for (n <- v2) {
  sum += n
}
sum is 1111

// 6
def sumIt(args:Int*):Int = {
  args.reduce((sum, n) => sum + n)
}
sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195
