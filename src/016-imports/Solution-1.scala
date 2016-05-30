import me.rafaavila.pythagorean.RigthTriangle
import me.rafaavila.pythagorean.EquilateralTriangle

val rt = new RigthTriangle
println(rt.hypotenuse(3, 4))
println(rt.area(3, 4))
assert(rt.hypotenuse(3, 4) == 5)
assert(rt.area(3, 4) == 6)

val et = new EquilateralTriangle
println(et.area(5))
assert(et.area(5) == 10.825317547305483)