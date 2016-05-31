import com.atomicscala.AtomicTest._
import me.rafaavila._

// exercise 1, we do not need more code to sitisfy this test
val cup2 = new Cup2
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20
