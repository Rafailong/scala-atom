import com.atomicscala.AtomicTest._

def f(n:Int):Int = n * 11

val n = 7
s"f($n) is ${f(n)}" is s"f($n) is 77"