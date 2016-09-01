import com.atomicscala.AtomicTest._

def oddLT(v:Vector[Int]):Vector[Int] = {
  var r = for {
    n <- v
    if n < 10
    if n % 2 != 0
  } yield n
  r
}
val v = Vector(1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14, 17)
oddLT(v) is Vector(1, 3, 5, 7)

def oddLT2(v:List[Int]):List[Int] = {
  for {
    n <- v
    gt = n < 10
    isOdd = n % 2 != 0
    if(gt && isOdd)
  } yield n
}
oddLT2(v.toList) is List(1, 3, 5, 7)

def oddLT3(v:List[Int]):Vector[Int] = {
  val r = for {
    n <- v
    gt = n < 10
    isOdd = n % 2 != 0
    if(gt && isOdd)
  } yield {
    val x = n * 10
    x + 2
  }
  r.toVector
}
oddLT3(v.toList) is Vector(12, 32, 52, 72)

def oddLT4(v:Vector[Int]) = {
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
oddLT4(v) is Vector(
  Vector(0),
  Vector(0, 1, 2),
  Vector(0, 1, 2, 3, 4),
  Vector(0, 1, 2, 3, 4, 5, 6)
)
