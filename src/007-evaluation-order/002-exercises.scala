/*
1. Write an expression that evaluates to true if the sky is “sunny” and
  the temperature is more than 80 degrees.
*/
val sunny = true
val partialCloudy = false
val temp = 90
if((sunny || partialCloudy) && temp > 80) { println("it is fine!") }

/*
2. Write an expression that evaluates to true if the sky is either
  “sunny” or “partly cloudy” and the temperature is more than 80
  degrees.
*/
val result = (sunny || partialCloudy) && temp > 80
println("result is", result)

/*
3. Write an expression that evaluates to true if the sky is either
  “sunny” or “partly cloudy” and the temperature is either more than
  80 degrees or less than 20 degrees.
*/
val result2 = (sunny || partialCloudy) && (temp > 80 || temp < 20)
println("result2 is", result)

/*
4. Convert Fahrenheit to Celsius.
*/
val celsius = (temp - 32.0) * (5.0 / 9.0)
println("Celsius", celsius)

/*
5. Convert Celsius to Fahrenheit.
*/
val fahrenheit = (celsius * (9.0 / 5.0)) + 32
println("Fahrenheit", fahrenheit)