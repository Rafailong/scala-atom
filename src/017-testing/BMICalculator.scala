import com.atomicscala.AtomicTest._

calculateBMI(160, 68) is "Normal"
calculateBMI(100, 68) is "Under"
calculateBMI(200, 68) is "Over"

def calculateBMI(lbs:Double, height:Int):String = {
  val bmi = lbs / (height*height) * 703.07
  if (bmi < 18.5) "Under"
  else if (bmi < 25) "Normal"
  else "Over"
}