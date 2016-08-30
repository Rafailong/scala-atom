import com.atomicscala.AtomicTest._

var s = ""
val duck = "Duck"
val v = duck.toVector
v.foreach(c => s = s + c + ":")

s is "D:u:c:k:"
