import com.atomicscala.AtomicTest._

// 1
def explicit(c1:Double, c2:Double, c3:Double):Vector[Double] =
  Vector(c1, c2, c3)

explicit(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)
