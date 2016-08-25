import com.atomicscala.AtomicTest._

class GardenGnome(val heigth:Double, val weight:Double, val happy:Boolean){
  var painted:Boolean = true

  def magic(level:Int):String = s"Poof! $level"

  def show(level:Int):String = s"${magic(level)} $happy $painted"
  def show():String = s"$heigth $weight $happy $painted"
}
val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0 110.0 false true"

val gnome2 = new GardenGnome(20.0, 50.0, false)
gnome2.show(87) is "Poof! 87 false true"
val bob = new GardenGnome(20.0, 50.0, true)
bob.show(25) is "Poof! 25 true true"