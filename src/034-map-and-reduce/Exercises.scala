import com.atomicscala.AtomicTest._

// 1
val v = Vector(1, 2, 3, 4)
val vR = v.map(n => (n * 11) + 10)
vR is Vector(21, 32, 43, 54)

// 2
var set = scala.collection.mutable.Set[Int]()
v.foreach(n => set += (n * 11) + 10)
set.toVector.sorted is Vector(21, 32, 43, 54)
