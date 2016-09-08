import com.atomicscala.AtomicTest._

// unpacking
def f = (1, 3.14, "Mouse", true, "Altitude")
val (n, d, a, b, h) = f
(a, b, d, h, n) is ("Mouse", true, 3.14, "Altitude", 1)

// indexing
val all = f
f._1 is 1
f._3 is "Mouse"
f._5 is "Altitude"
