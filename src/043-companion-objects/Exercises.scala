import com.atomicscala.AtomicTest._

class WalkActivity()
object WalkActivity {
  private var log = ""
  def start(name:String) {
    log = s"[$name] Activiy started."
    println(log)
  }
  def stop(name:String) {
    log = s"[$name] Activiy stoped."
    println(log)
  }
}

// no need to init the WalkActivity object
WalkActivity.start("Bob")
WalkActivity.stop("Bob")
