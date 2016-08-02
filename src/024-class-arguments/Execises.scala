import com.atomicscala.AtomicTest._

// 6
class Cup2(var percentFull:Int) {
  val max = 100
  def add (increment:Int):Int = {
    percentFull += increment
    if (percentFull > max) {
      percentFull = max
    }

    percentFull
  }
}
val cup2 = new Cup2(0)
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20