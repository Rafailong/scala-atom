
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
