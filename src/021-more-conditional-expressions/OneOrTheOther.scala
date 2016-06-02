import com.atomicscala.AtomicTest._

def oneOrTheOther(exp:Boolean):String = {
  if (exp) "true"
  else "false"
}

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "true"
oneOrTheOther(v2 == v2.reverse) is "false"