/* 
Scala's variables (var) can be reassigned in contrast with
values (val) that can be assigned only once

Variables come in handy when we have values that change over
the execution of or program

IT IS RECOMENDED TO ONLY USE val
*/

// as PI is a constant we use val to only
// assign it once
val pi:Double = 3.1416

// this is a circle radius and can change so we use var 
var r:Int = 2

// the are of a circle with a given radius wont change so we use val
val area = pi * (r * r)
println("the area is: ", area)

/*
exercises
------------------------------------------------
1. Create an Int value and set it to 5. Update it to 10
	What happened? How would you solve this problem? 
*/
val value:Int = 5
value = 10 // reassignment error; use var to solve this

/*
2. Create an Int variable named v1 and set it 5.
	Update it to 10 and store in a value named constant1.
	Did this work? Can you think of how this is useful?
*/
var v1:Int = 5
v1 = 10
val constant1:Int = v1
println("constant1 ", constant1)
/*
Yes, it worked.
This can be useful to calculate constant values
*/

/*
3. Using v1 and constant1 from above, set v1 to 15.
	Did the value of constant1 change?
*/
v1 = 15
println("constan1", constant1) // shouldn't change

/*
4. Create a new Int variable called v2 initialized to v1.
	Set v1 to 20. Did the value of v2 change?
*/
var v2 = v1
println("v2", v2)
v1 = 20
println("v2 changed?", v2) // should be 15