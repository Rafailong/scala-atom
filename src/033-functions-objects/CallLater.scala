
class CallLater(val f:() => Unit) {
  def call():Unit = f()
}

val cl = new CallLater(() => println("called!"))
cl.call()
