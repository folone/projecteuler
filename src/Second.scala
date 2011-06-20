/**
 * @author gleontiev
 * Date: 5/13/11
 * Time: 4:30 PM
 */

class Second extends Application {

  lazy val fib: Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))

  val res = fib.takeWhile(_ < 4000000).foldLeft(0) { (a,b) =>
    if(b % 2 != 0)
      a + b
    else
      a + 0
  }

  print(res)
}