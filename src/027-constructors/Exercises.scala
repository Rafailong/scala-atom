import com.atomicscala.AtomicTest._

// 1
class Coffee(
  val shots:Int = 2,
  val decaf:Int = 0,
  val milk:Boolean = false,
  val toGo:Boolean = false,
  val syrup:String = ""
) {
  val caf = shots - decaf
}

val doubleHalfCaf = new Coffee(shots = 2, decaf = 1)
doubleHalfCaf.decaf is 1
doubleHalfCaf.caf is 1
doubleHalfCaf.shots is 2

val tripleHalfCaf = new Coffee(shots = 3, decaf = 2)
tripleHalfCaf.caf is 1
tripleHalfCaf.shots is 3
tripleHalfCaf.decaf is 2