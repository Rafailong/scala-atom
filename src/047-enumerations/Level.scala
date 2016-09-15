
import com.atomicscala.AtomicTest._

object Level extends Enumeration {
  type Level = Value
  val Overflow, High, Medium, Low, Emtpy = Value
}

Level.Medium is "Medium"


import Level._
Medium is "Medium"

{
  for {
    n <- Range(0, Level.maxId)
  } yield (n, Level(n))
} is Vector(
  (0, Overflow),
  (1, High),
  (2, Medium),
  (3, Low),
  (4, Emtpy)
)

def checkLevel(lvl:Level) = lvl match {
  case Overflow => ">>> Overflow"
  case Emtpy => "Alert: Emtpy"
  case _ => s"Level $lvl OK"
}
checkLevel(Level.Overflow) is ">>> Overflow"
checkLevel(Level.Emtpy) is "Alert: Emtpy"
checkLevel(Medium) is "Level Medium OK"
