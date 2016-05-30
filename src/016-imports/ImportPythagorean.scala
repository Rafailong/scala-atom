import me.rafaavila.{RigthTriangle => RT}
import me.rafaavila.EquilateralTriangle

val rt = new RigthTriangle
println(rt.hypotenuse(3, 4))
println(rt.area(3, 4))
assert(rt.hypotenuse(3, 4) == 5)
assert(rt.area(3, 4) == 6)