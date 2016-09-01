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

def yielding3(v:Vector[Int]):Vector[Int] = {
  for {
    n <- v
    gt = n < 10
    isOdd = n % 2 != 0
    if(gt && isOdd)
  } yield {
    val x = n * 10
    x + 2
  }
}
yielding3(v) is Vector(12, 32, 52, 72)

def yielding4(v:Vector[Int]) = {
  for {
    n <- v
    gt = n < 10
    isOdd = n % 2 != 0
    if(gt && isOdd)
  } yield {
    for(u <- Range(0, n))
      yield u
  }
}
yielding4(v) is Vector(
  Vector(0),
  Vector(0, 1, 2),
  Vector(0, 1, 2, 3, 4),
  Vector(0, 1, 2, 3, 4, 5, 6)
)
