import com.atomicscala.AtomicTest._

class C {
  def increment() = { C.n += 1; C.n }
}
object C {
  private var n = 0 // private so cant be set outside the object/class
}

var a = new C
var b = new C
a.increment() is 1
b.increment() is 2
a.increment() is 3
