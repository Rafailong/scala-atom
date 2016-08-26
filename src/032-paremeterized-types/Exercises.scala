import com.atomicscala.AtomicTest._

// 1
def explicit(c1:Double, c2:Double, c3:Double):Vector[Double] =
  Vector(c1, c2, c3)

explicit(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

// 2
def explicitVectorToList(v:Vector[Double]):List[Double] =
  v.toList

explicitVectorToList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitVectorToList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

// 3
def explicitVectorToSet(v:Vector[Double]):Set[Double] =
  v.toSet

explicitVectorToSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitVectorToSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
