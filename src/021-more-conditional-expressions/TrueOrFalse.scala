import com.atomicscala.AtomicTest._

def trueOrFalse(e:Boolean):String = {
  if (e) return "true"
  "false"
}

trueOrFalse(1>2) is "false"
trueOrFalse(2>1) is "true"