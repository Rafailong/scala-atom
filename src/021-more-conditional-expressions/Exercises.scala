import com.atomicscala.AtomicTest._

// 1
val vector1 = Vector(1, 1, 1, 1) // todos repetidos
val vector2 = Vector(1, 2, 1, 2, 1) // intercalados

vector1 is vector1.reverse
vector2 is vector2.reverse