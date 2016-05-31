import com.atomicscala.AtomicTest._

class Cup2 {
  var percentFull = 0
  val max = 100
  def add (increment:Int):Int = {
    percentFull += increment
    if (percentFull > max) {
      percentFull = max
    }

    percentFull
  }
}

val c2 = new Cup2
c2.percentFull is 0

val added = c2.add(10)
added is 10

val added1 = c2.add(100)
added1 is 100
