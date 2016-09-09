import com.atomicscala.AtomicTest._

class GreatApe() {
  val weight = 100.0
  val age = 12
  def vocalize = "Grrr!"
}

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe
class BonoboB extends Bonobo

new GreatApe().vocalize is "Grrr!"
new Bonobo().vocalize is "Grrr!"
new Chimpanzee().vocalize is "Grrr!"
new BonoboB().vocalize is "Grrr!"
