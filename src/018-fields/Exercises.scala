import com.atomicscala.AtomicTest._
import me.rafaavila._

// exercise 1, we do not need more code to sitisfy this test
println("ex 1")
val cup2 = new Cup2
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20

// exercise 2
println("ex 2")
val cup3 = new Cup3
cup3.add(45) is 45
cup3.add(-55) is 0
cup3.add(10) is 10
cup3.add(-9) is 1
cup3.add(-2) is 0

// exercise 3
println("ex 3")
cup3.percentFull = 100
cup3.percentFull is 100


// exercise 4
println("ex 4")
val cup4 = new Cup4
cup4.setPercentFull(55)
cup4.getPercentFull() is 55
