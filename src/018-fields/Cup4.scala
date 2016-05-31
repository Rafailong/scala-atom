package me.rafaavila

class Cup4 {
  private var percentFull = 0
  val max = 100

  def getPercentFull ():Int = { percentFull }

  def setPercentFull (percent:Int):Unit = {
    percentFull = percent
  }

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
