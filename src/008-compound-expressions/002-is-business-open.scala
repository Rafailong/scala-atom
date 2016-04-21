val hour = 12

val isBusinessOpen = {
  val opens = 9
  val closes = 20
  println("Operating hours: " + opens + " - " + closes)
  (hour >= opens && hour <= closes)
}

println("Is business open at " + hour + "? " + isBusinessOpen)