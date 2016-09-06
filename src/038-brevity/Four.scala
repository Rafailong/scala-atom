import com.atomicscala.AtomicTest._

def explicit():Vector[Int] = Vector(1, 2, 3, 4)
explicit() is Vector(1, 2, 3, 4)

def inferred() = Vector(4, 3, 2, 1)
inferred() is Vector(4, 3, 2, 1)

// def unit():Unit same thing as bellow
// note there is no `=` sign
def unit() {
  Vector(1, 2, 3, 4)
}
unit() is ()
