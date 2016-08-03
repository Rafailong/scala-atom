import com.atomicscala.AtomicTest._

class F {
  def f():Int = { 0 }
  def f(a:Int):Int = { a }
  def f(a:Int, b:Int):Int = { a + b }
  def f(a:Int, b:Int, c:Int):Int = { a + b + c }
  def f(a:Int, b:Int, c:Int, d:Int) = { a + b + c + d }
  // def f(a:Int, b:Int, c:Int, d:Int):Double = { a + b + c + d } // error method defined twice
}

val f = new F
f.f() is 0
f.f(1) is 1
f.f(1, 2) is 3
f.f(1, 2, 3) is 6
f.f(1, 2, 3, 4) is 10