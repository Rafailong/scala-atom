import com.atomicscala.AtomicTest._

case class Bicycle(riders:Int)
val for2 = Bicycle(2)
for2 is "Bicycle(2)"


class Surrey(val adornment:String)
val s = new Surrey("adornment")
println(s) // fak :/
