import com.atomicscala.AtomicTest._

class Sum3(a:Int, b:Int, c:Int) {
  def reslt():Int = { a + b + c }
}

val s = new Sum3(1, 2, 3)
s.reslt() is 6