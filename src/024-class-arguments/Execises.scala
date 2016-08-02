import com.atomicscala.AtomicTest._

// 2
class Family(dad:String, mom:String, children:String*) {
  def familySize():Int = { children.length + 2 }
}
val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family2 = new Family("Mom", "Dad", "Harry")
family2.familySize() is 3