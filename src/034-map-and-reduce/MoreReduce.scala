import com.atomicscala.AtomicTest._

(1 to 100).reduce((sum, n) => sum + n) is 5050

val v = Vector("D", "u", "c", "k")
v.reduce((sum, n) => sum + n) is "Duck"
