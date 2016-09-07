import com.atomicscala.AtomicTest._

class SimpleTime(val h:Int, val m:Int) {
  def -(simpleTime:SimpleTime):SimpleTime = {
    val thisMins = (this.h * 60) + this.m
    val otherMins = (simpleTime.h * 60) + simpleTime.m

    val subs = thisMins - otherMins
    if (subs <= 0)
      return new SimpleTime(0, 0)

    val hrs:Int = subs/60
    val mns = subs - (hrs * 60)
    new SimpleTime(hrs, mns)
  }
}

val t1 = new SimpleTime(10, 30)
val t2 = new SimpleTime(9, 30)
val st = t1 - t2
st.h is 1
st.m is 0

val st2 = new SimpleTime(10, 30) - new SimpleTime(9, 45)
st2.h is 0
st2.m is 45


class FancyNumber1(val n:Int) {
  def ^(x:Int) = scala.math.pow(n, x)
}
val f1 = new FancyNumber1(2)
f1.^(3) is 8

val f2 = new FancyNumber1(10)
f2 ^ 2 is 100
