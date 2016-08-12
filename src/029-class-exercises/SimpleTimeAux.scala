import com.atomicscala.AtomicTest._

class SimpleTimeAux(val h:Int, val m:Int) {
  def this(hrs:Int) {
    this(h = hrs, m = 0)
  }

  def substract(SimpleTimeAux:SimpleTimeAux):SimpleTimeAux = {
    val thisMins = (this.h * 60) + this.m
    val otherMins = (SimpleTimeAux.h * 60) + SimpleTimeAux.m

    val subs = thisMins - otherMins
    if (subs <= 0)
      return new SimpleTimeAux(0)

    val hrs:Int = subs/60
    val mns = subs - (hrs * 60)
    new SimpleTimeAux(hrs, mns)
  }
}

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(6)
val auxST = auxT1.substract(auxT2)
auxST.h is 4
auxST.m is 5

val auxST2 = new SimpleTimeAux(12).substract(new SimpleTimeAux(9, 45))
auxST2.h is 2
auxST2.m is 15