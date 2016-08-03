import com.atomicscala.AtomicTest._

// 1
class SimpleTime(val hours:Int, val minutes:Int)
val t = new SimpleTime(hours=5, minutes=30)
t.hours is 5
t.minutes is 30