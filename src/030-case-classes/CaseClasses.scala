import com.atomicscala.AtomicTest._

case class Dog (name:String)
val dog1 = Dog("Fido")
val dog2 = Dog("Cleo")
val dogs = Vector(dog1, dog2)
dogs is Vector(Dog("Fido"), Dog("Cleo"))

case class Cat(name:String, age:Int)
val cats = Vector(Cat("Miffy", 3), Cat("Rags", 2))
cats is "Vector(Cat(Miffy,3), Cat(Rags,2))"
