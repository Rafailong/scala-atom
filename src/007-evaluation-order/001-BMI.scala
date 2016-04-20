val weightKg = 72
val heightM = 1.80

val bmi = weightKg / (heightM * heightM)
println("BMI", bmi)
if(bmi < 18.5) { println("underweight! :/") }
else if(bmi < 25) { println("normalito :)") }
else { println("overweight :(") }