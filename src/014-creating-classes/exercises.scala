/**
* 1. Create classes for Hippo, Lion, Tiger, Monkey, and Giraffe, then create an
*   instance of each one of those classes.
*/
class Hippo
class Lion
class Tiger
class Monkey
class Giraffe

val h = new Hippo
val l = new Lion
val t = new Tiger
val m = new Monkey
val g = new Giraffe

println(h, l, t, m, g)

/**
* 2. Create a second instance of Lion and two more Giraffe.
*   Print those objects.
*   Those new objects differ  from the above in that they are new and
*   stored in a diff momery. (Check the ugly number when printed)
*/

val l2 = new Lion
val g2 = new Giraffe
val g3 = new Giraffe
println(l2, g2, g3)