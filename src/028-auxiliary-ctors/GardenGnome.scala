import com.atomicscala.AtomicTest._

class GardenGnome(val heigth:Double, val weight:Double, val happy:Boolean){
  println("Inside primary ctor")

  var painted:Boolean = true

  // notice there is no equal to sign
  def this(heigth:Double) { this(heigth, 100.0, true) }

  def this(name:String) { this(15.0) }

  def magic(level:Int):String = { "Poof! " +level }

  def show():String = { s"$heigth $weight $happy $painted" }
}

(new GardenGnome(20.0, 110.0, false)).show() is "20.0 110.0 false true"

(new GardenGnome("Bob")).show() is "15.0 100.0 true true"