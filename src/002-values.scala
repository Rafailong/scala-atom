val whole = 11
val fractional = 1.5
val words = "Rafael Avila"

println(whole, fractional, words)

/*
 Once a `val` is assigned it can't be changed 
 if we try
 `whole = 15`
 scala will say "error: reassignment to val."
*/

// exercises
// 1. Store (and print) the value 17
val the17 = 17
println(the17)

// 2. Using the value just stored (17), try to change it to 20
// this throws reassignment error
// the17 = 20

// 3. Store and print the value "ABC1234"
var abc = "ABC1234"
println(abc)

// 4. Using the value you just stored (abc), try to change it to "DFE1234"
// String is mutable!!! :O
abc = "DFE1234"

// 5. Store and print the value 15.56
val frac = 15.56
println(frac)