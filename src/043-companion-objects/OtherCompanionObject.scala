import com.atomicscala.AtomicTest._

class C
object C {
  private var n = 0

  // we use object memebers without qualification
  def increment() = { n += 1; n }
  def count() = increment()
}

C.increment() is 1
C.increment() is 2
C.increment() is 3
C.count() is 4
