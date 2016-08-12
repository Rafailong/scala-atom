import com.atomicscala.AtomicTest._

class SimpleTime(val h:Int, val m:Int) {
  def substract(simpleTime:SimpleTime):SimpleTime = {
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
val st = t1.substract(t2)
st.h is 1
st.m is 0

val st2 = new SimpleTime(10, 30).substract(new SimpleTime(9, 45))
st2.h is 0
st2.m is 45

val st3 = new SimpleTime(9, 30).substract(new SimpleTime(10, 0))
st3.h is 0
st3.m is 0