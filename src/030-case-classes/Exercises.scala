import com.atomicscala.AtomicTest._

case class Person(first:String, last:String, email:String)
val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"

val people = Vector(
  Person("Jane", "Smile", "jane@smile.com"),
  Person("Ron", "House", "ron@house.com"),
  Person("Sally", "Dove", "sally@dove.com")
)
people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"

case class Dog(name:String, breed:String)
val dogs = Vector(
  Dog("Fido", "Golden Lab"),
  Dog("Ruff", "Alaskan Malamute"),
  Dog("Fifi", "Miniature Poodle")
)
dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"

case class Dimension(height:Int, var width:Int)
val c = Dimension(5, 7)
c.height is 5
// c.height = 10 // this throws reassignment error
// c.height is 10
c.width is 7
c.width = 19
c.width is 19

case class OtherSimpleTime(val h:Int, val m:Int = 0) {
  def substract(OtherSimpleTime:OtherSimpleTime):OtherSimpleTime = {
    val thisMins = (this.h * 60) + this.m
    val otherMins = (OtherSimpleTime.h * 60) + OtherSimpleTime.m

    val subs = thisMins - otherMins
    if (subs <= 0)
      return new OtherSimpleTime(0)

    val hrs:Int = subs/60
    val mns = subs - (hrs * 60)
    new OtherSimpleTime(hrs, mns)
  }
}
val anotherT1 = OtherSimpleTime(10, 30)
val anotherT2 = OtherSimpleTime(9)
val anotherST = anotherT1.substract(anotherT2)
anotherST.h is 1
anotherST.m is 30
val anotherST2 = OtherSimpleTime(10).substract(OtherSimpleTime(9, 45))
anotherST2.h is 0
anotherST2.m is 15