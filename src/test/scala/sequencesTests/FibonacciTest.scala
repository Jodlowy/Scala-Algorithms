package sequencesTests

import org.scalatest.{FlatSpec, Matchers}
import sequences.Fibonacci

class FibonacciTest extends FlatSpec with Matchers {

  val fibonacci = Fibonacci(6)

  "generate" should "return string of fibonacci sequence of given length" in {
    fibonacci.generate shouldBe "0, 1, 1, 2, 3, 5"
  }

  "generateRecursively" should "return string of fibonacci sequence of given length" in {
    fibonacci.generateRecursively shouldBe "0, 1, 1, 2, 3, 5"
  }

  "generateFunc" should "return string of fibonacci sequence of given length" in {
    fibonacci.generateFunc shouldBe "0, 1, 1, 2, 3, 5"
  }

}
