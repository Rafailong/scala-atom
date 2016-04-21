// in Scala everything is an expression
// there are two kinds of expressions
// simple and compound expressions

val r = 1 + 2 // simple expression
println("result of a simple expression:" + r)

// compound expression
val rCompound = {
  val a = 1
  val b = 5
  a + b
}
println("result of a compound expression: " + rCompound)

// this throws "error: not found: value `a`"
// println("here, out of the compound expression we cannot access `a` o `b` " + a)

// we can have compound expressions that do not produce a value (Unit type)
val void = { val one = 1 }
println(void)