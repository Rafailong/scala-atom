import com.atomicscala.AtomicTest._

// 9
def squareThem(args:Int*):Int = {
  var t = 0
  for(n <- args) {
    t += n * n
  }
  t
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21