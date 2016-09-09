import com.atomicscala.AtomicTest._

class House(val address:String, val state:String, val zip:String) {
  def this(zip:String) = this("address?", "state?", zip)
  def this(state:String, zip:String) = this("address?", state, zip)
}

class Home(address:String, state:String, zip:String, val name:String)
  extends House(address, state, zip) {
    override def toString(): String = s"$name: $address, $state $zip"
}

class VacationHouse(
  state:String,
  zip:String,
  val startMonth:Int,
  val endMonth:Int)
  extends House(state, zip)

class TreeHouse(
  val name:String,
  zip:String)
  extends House(zip)

val h = new Home("address", "st", "cp", "mine")
h.address is "address"
h.state is "st"
h.zip is "cp"
h is "mine: address, st cp"

val v = new VacationHouse("st", "cp", 6, 8)
v.state is "st"
v.zip is "cp"
v.startMonth is 6
v.endMonth is 8

val t = new TreeHouse("Oak", "14789")
t.name is "Oak"
t.zip is "14789"
