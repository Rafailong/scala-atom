import com.atomicscala.AtomicTest._

// 3
class Family(dad:String, mom:String, children:String*) {
  def familySize():Int = { children.length + 2 }
}
val family1 = new Family("Mom", "Dad")
family1.familySize() is 2