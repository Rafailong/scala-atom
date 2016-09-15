
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
