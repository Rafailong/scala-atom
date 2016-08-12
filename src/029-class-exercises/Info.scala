import com.atomicscala.AtomicTest._

class Info(var name:String, var description:String)

val info = new Info("stuff", "Something")
info.name is "stuff"
info.name = "this is the new name"
info.name is "this is the new name"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"