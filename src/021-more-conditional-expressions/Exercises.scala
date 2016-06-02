import com.atomicscala.AtomicTest._

// 1
val vector1 = Vector(1, 1, 1, 1) // todos repetidos
val vector2 = Vector(1, 2, 1, 2, 1) // intercalados

vector1 is vector1.reverse
vector2 is vector2.reverse

// 2
def isPalindrome(s:String):Boolean = s.reverse == s
isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false

// 3
def isPalindrome2(s:String):Boolean = {
  val sLower = s.toLowerCase
  sLower.reverse == sLower
}
isPalindrome2("Mom") is true
isPalindrome2("Dad") is true
isPalindrome2("sTrEeT") is false

// 4
def stripSpecialChars(s:String):String = {
  var x = ""
  s.foreach(c => {
    val asInt = c.toInt
    // letras
    if (asInt >= 65 && asInt <= 122) x += c
    else if (asInt >= 48 && asInt <= 57) x += c
  })
  x
}
val isPalindromeComposed = isPalindrome2 _ compose stripSpecialChars _
isPalindromeComposed("Madam I'm adam") is true
isPalindromeComposed("trees") is false