import com.atomicscala.AtomicTest._

// 1
class Family(args:String*) {
  def familySize():Int = { args.length }
}
val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family2 = new Family("Mom", "Dad", "Harry")
family2.familySize() is 3