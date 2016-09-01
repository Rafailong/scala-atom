import com.atomicscala.AtomicTest._

def evenGT5(v:Vector[Int]):Vector[Int] = {
  var r = Vector[Int]()
  for {
    n <- v
    if n > 5
    if n % 2 == 0
  } r = r :+ n
  r
}

val v = Vector(1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14, 17)
evenGT5(v) is Vector(6, 8, 10, 14)
