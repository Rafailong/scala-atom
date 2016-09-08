import com.atomicscala.AtomicTest._

 // this is type inference to solve return value type
 // the type would be (Double, String)
def data(input:Double) =
  if (input > 5d) (input*2, "High")
  else (input*2, "Low")

data(7d) is (14d, "High")
data(4d) is (8d, "Low")
