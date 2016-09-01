import com.atomicscala.AtomicTest._

def oddLT(v:Vector[Int]):Vector[Int] = {
  var r = for {
    n <- v
    if n < 10
    if n % 2 != 0
  } yield n
  r
}
val v = Vector(1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14, 17)
oddLT(v) is Vector(1, 3, 5, 7)

def oddLT2(v:List[Int]):List[Int] = {
  for {
    n <- v
    gt = n < 10
    isOdd = n % 2 != 0
    if(gt && isOdd)
  } yield n
}
oddLT2(v.toList) is List(1, 3, 5, 7)

def oddLT3(v:List[Int]):Vector[Int] = {
  val r = for {
    n <- v
    gt = n < 10
    isOdd = n % 2 != 0
    if(gt && isOdd)
  } yield {
    val x = n * 10
    x + 2
  }
  r.toVector
}
oddLT3(v.toList) is Vector(12, 32, 52, 72)

case class Activity(date:String, activity:String)
val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run")
)
def getDates(activity:String, activities:Vector[Activity]):Vector[String] = {
  for {
    a <- activities
    if (a.activity == activity)
  } yield a.date
}
getDates("Ski", activities) is Vector("01-03", "01-10")
getDates("Run", activities) is Vector("01-01", "01-04", "01-03")
getDates("Bike", activities) is Vector()
