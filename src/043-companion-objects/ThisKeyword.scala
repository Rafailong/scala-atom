import com.atomicscala.AtomicTest._

class Tipo(val n:Int) {
  // to be explicit about the object
  // f is applied to
  def f = this.n * 10
}

val t = new Tipo(1)
t.f is 10

val t2 = new Tipo(2)
t2.f is 20
