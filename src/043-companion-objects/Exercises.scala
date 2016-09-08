import com.atomicscala.AtomicTest._

class WalkActivity() {
  def calories(lbs:Int, mins:Int, mph:Double=3) =
    WalkActivity.calories(lbs, mins, mph)
}
object WalkActivity {
  def MET(mph:Double) = mph match {
    case x if(x < 1.7) => 2.3
    case x if(x < 2.5) => 2.9
    case x if(x < 3) => 3.3
    case x if(x >= 3) => 3.3
    case _ => 2.3
  }

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
    math.round((MET(mph) * 3.5 * lbs * 0.45)/200d * mins)
}

// no need to init the WalkActivity object
WalkActivity.start("Bob")
WalkActivity.stop("Bob")

val bob = new WalkActivity
bob.calories(150, 30) is 117

val fred = WalkActivity
fred.calories(150, 30, 1.5) is 82
