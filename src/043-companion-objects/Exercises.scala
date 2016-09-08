import com.atomicscala.AtomicTest._

class WalkActivity() {
  def calories(lbs:Int, mins:Int, mph:Double=3) =
    WalkActivity.calories(lbs, mins, mph)
}
object WalkActivity {
  val MET = 2.3
  private var log = ""
  def start(name:String) {
    log = s"[$name] Activiy started."
    println(log)
  }
  def stop(name:String) {
    log = s"[$name] Activiy stoped."
    println(log)
  }
  def calories(lbs:Int, mins:Int, mph:Double=3):Long =
    math.round((MET * 3.5 * lbs * 0.45)/200d * mins)
}

// no need to init the WalkActivity object
WalkActivity.start("Bob")
WalkActivity.stop("Bob")

val bob = new WalkActivity
bob.calories(150, 30) is 82
