val whole:Int = 1
val frac:Double = 2.01
var boolean:Boolean = false
val string:String = "rafailong"
val multiLineString:String = """this
  is a
  multiline string
  """
println(whole, frac, boolean, string)
println(multiLineString)

// exercises
// 1. Store the value 5 as an Int and print it
val five:Int = 5

// 2. Store the value `AB1234` as String
val abc:String = "ABC1234"

// 3. Store the value 5.4 as Double
val farc:Double = 5.4

// 4. Store de balue true as Boolean
val bool:Boolean = true

println(five, abs, frac, bool)

// 5. Store a miltiline String
// this prints as is, multiline
val multiLine:String = """this
  is another
  multiline string
  """

println(multiLine)

// 6. What happens if you try to store a string as Boolean?
// error: type mismatch
val bool2:Boolean = "true"

// 7. What happens if you try to store 15.4 as Int?
// error: type mismatch
val int:Int = 15.4

// 8. What happens if you try to store 15 as Double?
// it gets converted to fractional number as 15.0
val double:Double = 15
println(double)