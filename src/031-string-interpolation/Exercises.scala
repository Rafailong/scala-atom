import com.atomicscala.AtomicTest._

class GardenGnome(val heigth:Double, val weight:Double, val happy:Boolean){
  var painted:Boolean = true

  def show():String = s"$heigth $weight $happy $painted"
}
val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0 110.0 false true"