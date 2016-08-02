import com.atomicscala.AtomicTest._

class Sum(args:Int*) {
  def result():Int = {
    var t = 0
    for(i <- args) {
      t += i
    }
    t
  }
}

val s = new Sum(1, 2, 3, 4, 5)
s.result() is 15