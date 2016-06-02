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
