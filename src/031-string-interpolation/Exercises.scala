import com.atomicscala.AtomicTest._

class GardenGnome(val heigth:Double, val weight:Double, val happy:Boolean){
  var painted:Boolean = true

  def this(heigth:Double) { this(heigth, 100.0, true) }
  def this(name:String) { this(15.0) }

  def magic(level:Int):String = s"Poof! $level"

  def show(level:Int):String = s"${magic(level)} $happy $painted"
  def show():String = s"$heigth $weight $happy $painted"
}
val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0 110.0 false true"

val gnome2 = new GardenGnome(20.0, 50.0, false)
gnome2.show(87) is "Poof! 87 false true"
val bob = new GardenGnome("Bob")
bob.show(25) is "Poof! 25 true true"

class GardenGnomeTwo(val heigth:Double, val weight:Double, val happy:Boolean, var name:String = null){
  var painted:Boolean = true

  def this(heigth:Double, name:String) { this(heigth, 100.0, true, name) }
  def this(name:String) { this(15.0, name) }

  def show():String = {
    println(s"name: $name isBlank ${isBlank(Option(name))}")
    if (isBlank(Option(name))) {
      s"heigth: $heigth weight: $weight happy: $happy painted: $painted"
    } else {
      s"heigth: $heigth weight: $weight $happy $painted"
    }
  }

  private def isBlank(input:Option[String]):Boolean = {
    input match {
      case None    => true
      case Some(s) => s.trim.isEmpty
    }
  }
}
val gnome3 = new GardenGnomeTwo(20.0, 110.0, false)
gnome3.show() is "heigth: 20.0 weight: 110.0 happy: false painted: true"
val gnome4 = new GardenGnomeTwo("Bob")
gnome4.show() is "heigth: 15.0 weight: 100.0 true true"