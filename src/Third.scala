/**
 * @author gleontiev
 * Date: 5/13/11
 * Time: 4:58 PM
 */

class Third extends Application {

  def ints(n: Int): Stream[Int] =
    Stream.cons(n, ints(n+1))

  def primes(nums: Stream[Int]): Stream[Int] =
    Stream.cons(nums.head,
                primes ((nums tail) filter (x => x % nums.head != 0)) )

  val res = primes(ints(2)).takeWhile(_ < (600851475143L / 2)).toList.foldLeft(0) { (a,b) =>
    if(b > a && 600851475143L % b == 0)
      b
    else
      a
  }

  print(res)
}