// 1
class Sailboat {
  def raise():String = { "Sails raised" }
  def lower():String = { "Sails lowered" }
}

class Motorboat {
  def start():String = { "Morot on" }
  def stop():String = { "Morot off" }
}

val sailsboat = new Sailboat

val r1 = sailsboat.raise()
assert(r1 == "Sails raised")

val r2 = sailsboat.lower()
assert(r2 == "Sails lowered")

val motorboat = new Motorboat

val s1 = motorboat.start()
assert(s1 == "Morot on")

val s2 = motorboat.stop()
assert(s2 == "Morot off")

// 2
class Flare {
  def light():String = { "Flare used!" }
}

val flare = new Flare

val f1 = flare.light()
assert(f1 == "Flare used!")

// 3
class Sailboat1 {
  def raise():String = { "Sails raised" }
  def lower():String = { "Sails lowered" }
  def signal():String = {
    val f = new Flare
    f.light()
  }
}

class Motorboat1 {
  def start():String = { "Morot on" }
  def stop():String = { "Morot off" }
  def signal():String = {
    val f = new Flare
    f.light()
  }
}

val sailsboat1 = new Sailboat1
val motorboat1 = new Motorboat1

assert(sailsboat1.signal() == "Flare used!")
assert(motorboat1.signal() == "Flare used!")
