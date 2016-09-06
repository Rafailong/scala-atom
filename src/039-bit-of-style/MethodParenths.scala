import com.atomicscala.AtomicTest._

class Simple(val a:String) {
  def getA() = a
  def getA2 = a
}

val s = new Simple("Rafailong")
// due to getA was defined with parenths we can call it
// with or without them
s.getA() is "Rafailong"
s.getA is "Rafailong"

// but we are not allowd to use parenth
// when calling a method that was defined
// without them
s.getA2 is "Rafailong"
/* error s.getA2() is "Rafailong" */
