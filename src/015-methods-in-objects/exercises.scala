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