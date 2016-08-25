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

case class Dimension(var height:Int, var width:Int)
val c = Dimension(5, 7)
c.height is 5
c.height = 10
c.height is 10
c.width is 7
c.width = 19
c.width is 19
