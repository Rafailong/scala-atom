import com.atomicscala.AtomicTest._

case class Count() {
  val id = Count.id()
  override def toString(): String =  s"Count:$id"
}
object Count {
  private var n = -1
  private def id() = { n += 1; n }
}

Vector(new Count, new Count, new Count) is "Vector(Count:0, Count:1, Count:2)"
