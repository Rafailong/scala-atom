import com.atomicscala.AtomicTest._

class OtherSimpleTime(val h:Int, val m:Int = 0) {
  def substract(OtherSimpleTime:OtherSimpleTime):OtherSimpleTime = {
    val thisMins = (this.h * 60) + this.m
    val otherMins = (OtherSimpleTime.h * 60) + OtherSimpleTime.m

    val subs = thisMins - otherMins
    if (subs <= 0)
      return new OtherSimpleTime(0)

    val hrs:Int = subs/60
    val mns = subs - (hrs * 60)
    new OtherSimpleTime(hrs, mns)
  }
}

val anotherT1 = new OtherSimpleTime(10, 30)
val anotherT2 = new OtherSimpleTime(9)
val anotherST = anotherT1.substract(anotherT2)
anotherST.h is 1
anotherST.m is 30

val anotherST2 = new OtherSimpleTime(10).substract(new OtherSimpleTime(9, 45))
anotherST2.h is 0
anotherST2.m is 15