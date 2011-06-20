/**
 * @author gleontiev
 */

class Tenth extends Application {
  def primes(nums: Stream[Int]): Stream[Int] =
        Stream.cons(nums.head,
                    primes ((nums tail) filter (x => x % nums.head != 0)) )
  def ints(n: Int): Stream[Int] = Stream.cons(n, ints(n+1))
  val ourPrimes = primes(ints(2))
  val result = primes.takeWhile(_ < 2000000).sum
  println result
}
