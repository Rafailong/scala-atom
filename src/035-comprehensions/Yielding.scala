import com.atomicscala.AtomicTest._

def yielding(v:Vector[Int]):Vector[Int] = {
  var r = for {
    n <- v
    if n < 10
    if n % 2 != 0
  } yield n
  r
}
val v = Vector(1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14, 17)
yielding(v) is Vector(1, 3, 5, 7)

def yielding2(v:Vector[Int]):Vector[Int] = {
  for {
    n <- v
    gt = n < 10
    isOdd = n % 2 != 0
    if(gt && isOdd)
  } yield n
}
yielding2(v) is Vector(1, 3, 5, 7)
