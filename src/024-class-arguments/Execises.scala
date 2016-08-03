import com.atomicscala.AtomicTest._

// 8
class Cup2(var percentFull:Int) {
  val max = 100
  def add (increments:Int*):Int = {
    for(i <- increments) {
      percentFull += i
      if(percentFull > 100) percentFull = 100
      else if(percentFull < 0) percentFull = 0
    }

    percentFull
  }
}
val cup2 = new Cup2(0)
cup2.add(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup2.add(10, 10, -10, 10, 90, 70, -70) is 30