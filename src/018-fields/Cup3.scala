package me.rafaavila

class Cup3 {
  var percentFull = 0
  val max = 100
  def add (increment:Int):Int = {
    percentFull += increment
    if (percentFull > max) {
      percentFull = max
    }

    if (percentFull < 0) {
      percentFull = 0
    }
    
    percentFull
  }
}
