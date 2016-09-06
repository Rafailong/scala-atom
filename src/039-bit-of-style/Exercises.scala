import com.atomicscala.AtomicTest._

class Exclaim(var s:String) {
  def parens() = s"$s!"
  def noParens = s"$s!"
}

val e = new Exclaim("hi")
e.parens() is "hi!"
e.noParens is "hi!"
