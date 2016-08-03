import com.atomicscala.AtomicTest._

//2
class Planet(val name:String, val description:String, val moons:Int = 1) {
  val hasMoon = moons > 0
}
val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
p.hasMoon is false