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

def squareArea(x:Double):Double = { x * x }
squareArea(5) is 25
squareArea(1.5) is 2.25

def rectangleArea(x:Double, y:Double):Double = { x * y }
rectangleArea(1, 2) is 2
rectangleArea(1.5, 2) is 3

def trapezoidArea(a:Double, b:Double, h:Double) = {
  (a + b)/2 * h
}
trapezoidArea(2, 3, 1) is 2.5
trapezoidArea(1, 10, 5) is 27.5

squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25
rectangleArea(2, 2) is 4
rectangleArea(5, 4) is 20
trapezoidArea(2, 2, 4) is 8
trapezoidArea(3, 4, 1) is 3.5
