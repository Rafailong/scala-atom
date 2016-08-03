import com.atomicscala.AtomicTest._

// 1
class SimpleTime(val hours:Int, val minutes:Int = 0)
val t = new SimpleTime(hours=10)
t.hours is 10
t.minutes is 0