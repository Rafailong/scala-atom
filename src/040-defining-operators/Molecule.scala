
class Molecule() {
  var attached:Molecule = _
  def plus(other:Molecule) = {
    attached = other
  }
  def +(other:Molecule) = {
    attached = other
  }
}

// normal method calling
val m = new Molecule
m.plus(new Molecule)
m.+(new Molecule)

// infix calling
val m2 = new Molecule
m plus m2
m + m2
