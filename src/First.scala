/**
 * @author gleontiev
 * Date: 5/13/11
 * Time: 3:51 PM
 */

class First extends Application {
  val res = (0 to 999).toList.foldLeft(0) { (a, b) =>
    if (b % 3 == 0 || b % 5 == 0)
      a + b
    else
      a + 0
  }

  print(res)
}