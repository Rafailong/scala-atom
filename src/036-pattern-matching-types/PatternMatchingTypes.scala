import com.atomicscala.AtomicTest._

case class Person(name:String)

def matcher(arg: Any): String = {
  arg match {
    case p:Person => s"Hi I'm ${p.name}"
    case s:String => s"A string: $s"
    case n:Int if (n < 20) => s"Int less than 20 = $n"
    case n:Int => s"Some other Int = $n"
    case _ => "Dunno what it is 😣"
  }
}

matcher(5) is "Int less than 20 = 5"
matcher(25) is "Some other Int = 25"
matcher("lol") is "A string: lol"

val me = Person("Rafa")
matcher(me) is "Hi I'm Rafa"

matcher(true) is "Dunno what it is 😣"
