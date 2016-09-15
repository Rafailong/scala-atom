
import com.atomicscala.AtomicTest._

// 1
object MonthName extends Enumeration {
  type MonthName = Value
  val January, February = Value
}
MonthName.February is "February"
MonthName.February.id is 1
