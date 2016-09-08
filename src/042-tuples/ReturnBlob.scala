import com.atomicscala.AtomicTest._

case class ReturnBlob(data:Double, info:String)

def data(input:Double):ReturnBlob =
  if (input > 5d) ReturnBlob(input*2, "High")
  else ReturnBlob(input*2, "Low")

data(7d) is ReturnBlob(14d, "High")
data(4d) is ReturnBlob(8d, "Low")
