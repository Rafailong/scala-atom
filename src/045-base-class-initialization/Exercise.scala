import com.atomicscala.AtomicTest._

import com.atomicscala.AtomicTest._

class GreatApe(val weight:Double, val age:Int, val other:String = "")

class Bonobo(weight:Double, age:Int)
  extends GreatApe(weight, age)

class Chimpanzee(weight:Double, age:Int)
  extends GreatApe(weight, age)

class BonoboB(weight:Double, age:Int)
  extends Bonobo(weight, age)

class BonoboC(weight:Double, age:Int)
  extends BonoboB(weight, age)

def display(ape:GreatApe) = s"weight: ${ape.weight} age: ${ape.age}"

display(new GreatApe(100d, 12)) is "weight: 100.0 age: 12"
display(new Bonobo(100d, 12)) is "weight: 100.0 age: 12"
display(new Chimpanzee(100d, 12)) is "weight: 100.0 age: 12"
display(new BonoboB(100d, 12)) is "weight: 100.0 age: 12"
display(new BonoboC(100d, 22)) is "weight: 100.0 age: 22"
