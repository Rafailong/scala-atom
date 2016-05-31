import com.atomicscala.AtomicTest._

val myVal1 = 10
val myVal2 = 20

myVal1 is myVal2

val myValue3 = 10
val myValue4 = 10

myValue3 is myValue4

myVal1 is myValue3 // this will match

val myValue5 = "10"

myVal1 is myValue5 // this will match
