package me.rafaavila.pythagorean

class RigthTriangle {
  def hypotenuse(a:Double, b:Double):Double = {
    Math.sqrt(a*a + b*b)
  }

  def area(a:Double, b:Double):Double = {
    a*b/2
  }
}

class EquilateralTriangle {
  def area(side:Double):Double = {
    (Math.sqrt(3)/4) * (side*side)
  }
}