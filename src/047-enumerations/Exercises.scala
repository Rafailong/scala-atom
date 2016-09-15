
import com.atomicscala.AtomicTest._

// 1
object MonthName extends Enumeration {
  type MonthName = Value
  val January = Value(1)
  val February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December = Value
}
MonthName.February is "February"
MonthName.February.id is 2
MonthName.December.id is 12
MonthName.July.id is 7

// 3
import MonthName._

def monthNumber(month:MonthName):Int = month.id
July is "July"
monthNumber(July) is 7

// 4
def season(month:MonthName):String = month.id match {
  case n if (March.id <= n && May.id >= n) => "Spring"
  case n if (June.id <= n && August.id >= n) => "Summer"
  case n if (September.id <= n && November.id >= n) => "Autumn"
  case _ => "Winter"
}
season(January) is "Winter"
season(April) is "Spring"
season(August) is "Summer"
season(November) is "Autumn"

// 5
object MoveInX extends Enumeration {
  type MoveInX = Value
  val MoveInX1, MoveInX2, MoveInX3 = Value
}
object MoveInY extends Enumeration {
  type MoveInY = Value
  val MoveInY1, MoveInY2, MoveInY3 = Value
}
object Sign extends Enumeration {
  type Sign = Value
  val X, Y, Empty = Value
}
import MoveInX._
import MoveInY._
import Sign._
class Cell {
  private var entry:Sign = Sign.Empty
  def set(e:Sign) = if (entry == Empty) {
      entry = e
      "Good move"
    } else {
      "Invalid move"
    }
  def get = entry
  override def toString(): String = s"$entry"
}
class Grid {
  private val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(s:Sign, x:MoveInX, y:MoveInY) =
    cells(y.id)(x.id).set(s)
}
val g = new Grid
g.play(X, MoveInX3, MoveInY1) is "Good move"
g.play(Y, MoveInX2, MoveInY1) is "Good move"
g.play(X, MoveInX3, MoveInY1) is "Invalid move"

// 6
object Level extends Enumeration {
  type Level = Value
  val Overflow = Value(1)
  val High, Medium, Low, Draining, Pooling, Dry, Empty = Value
}
import Level._
def checkLevel(lvl:Level) = lvl match {
  case Overflow => ">>> Overflow"
  case Pooling => "Warning!"
  case l if(l == Level.Empty || l == Dry) => "Alert"
  case _ => s"Level $lvl OK"
}
Level.Draining is Draining
Level.Draining.id is 5
checkLevel(Low) is "Level Low OK"
checkLevel(Level.Empty) is "Alert"
checkLevel(Draining) is "Level Draining OK"
checkLevel(Pooling) is "Warning!"
checkLevel(Dry) is "Alert"
