import com.atomicscala.AtomicTest._

class Exclaim3(var s:String, var count:Int = 0) {
  def parens() = {
    this.count += 1
    s"$s!"
  }
  val noParens = s"$s!" // no need to remove, it wont change once assigned
}

val e = new Exclaim3("hi")
e.parens() is "hi!"
e.parens() is "hi!"
e.count is 2
