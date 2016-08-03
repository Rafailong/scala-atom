import com.atomicscala.AtomicTest._

// 4
class Planet(val name:String, val description:String, val moons:Int = 1) {
  val hasMoon = moons > 0
}
val p = new Planet(moons = 2, name = "Mercury", description = "small and hot planet")
p.hasMoon is true