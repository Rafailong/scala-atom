import com.atomicscala.AtomicTest._

class WalkActivity()
object WalkActivity {
  def start(name:String) { println("started!") }
}

// no need to init the WalkActivity object
WalkActivity.start("Bob")
