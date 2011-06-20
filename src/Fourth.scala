/**
 * @author gleontiev
 */

class Fourth extends Application {
  val lst = (100 to 999).toList

  def isPalindrome(n:Int) : Boolean = {
         val str = n.toString
         val strRev = str.reverse
         str == strRev
     }

  val pairs = for(x <- lst; y <- lst) yield (x,y)


    val pals = for((x,y) <- pairs) yield {
      val num = x*y
      if(isPalindrome(num)) num
      else 0
      }.max

  println pals
}
