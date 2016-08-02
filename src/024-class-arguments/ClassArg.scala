import com.atomicscala.AtomicTest._

class ClassArg(a:Int) {
  println(f)
  def f():Int = { a * 10 }
}

// val ca0 = new ClassArg() // error

val ca = new ClassArg(19)
ca.f()
// ca.a // error will not be visible

class ClassArg2(var a:Int)
val ca2 = new ClassArg2(1)
ca2.a is 1
ca2.a = 10
ca2.a is 10

class ClassArg3(val a:Int)
val ca3 = new ClassArg3(1)
ca3.a is 1
// ca3.a = 10 // error