import com.atomicscala.AtomicTest._

class Cup {
  var percentFull = 0
}

val cup1 = new Cup
cup1.percentFull is 0

cup1.percentFull = 10
cup1.percentFull is 10

val cup2 = new Cup
cup2.percentFull is 0

cup2.percentFull = 20
cup2.percentFull is 20
cup1.percentFull is cup2.percentFull
