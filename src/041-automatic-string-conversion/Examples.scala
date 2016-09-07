import com.atomicscala.AtomicTest._

case class Bicycle(riders:Int)
val for2 = Bicycle(2)
for2 is "Bicycle(2)"


class Surrey(val adornment:String)
val s = new Surrey("adornment")
println(s) // fak :/

class Surrey2(val adornment:String) {
  override def toString(): String =
    s"Surrey2 with $adornment"
}
var s2 = new Surrey2("adornment")
s2.toString is "Surrey2 with adornment"
