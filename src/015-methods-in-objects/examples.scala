class Dog {
  def bark():String = { "woff!" }
}

class Cat {
  def meow():String = { "mew!" }
}

val cat = new Cat
val cat2 = new Cat

assert(cat.meow() == cat.meow())

class Hamster {
  def speak():String = {
    "hi there!"
  }
  def exercises():String = {
    speak() + " I am running on wheel"
  }
}
val h1 = new Hamster
val h2 = new Hamster
assert(h1.exercises() == "hi there! I am running on wheel")