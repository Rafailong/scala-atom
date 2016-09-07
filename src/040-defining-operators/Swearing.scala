import language.postfixOps

class Swearing() {
  def #!>% = "Rozafrazaca!"
}

val x = new Swearing
println(x.#!>%)
println(x #!>%)
