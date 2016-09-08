import com.atomicscala.AtomicTest._

def test(tuple:(Int, String, String)) {
  val (temp1, sky1, view1) = tuple
  temp1 is tuple._1
  sky1 is tuple._2
  view1 is tuple._3
}

test((65, "Sunny", "Stars"))
test((78, "Cloudy", "Satellites"))
test((51, "Blue", "Night"))


val info = (50, 45)
info._1 is 50
info._2 is 45
