/**
 * @author gleontiev
 */

class Fifth extends Application {
  lazy val naturals: Stream[Int] = Stream.cons(2520, naturals.map(_ + 1))

  def divides(n:Int):Boolean = {
    (for(x <- 11 to 20) yield {
        if(n % x == 0) true
        else false
    }).foldLeft(true) { (a,b) =>
        a && b
    }
}

  println naturals.dropWhile(n => {
    !divides(n)
  })
}
