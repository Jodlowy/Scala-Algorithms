package sequencesTests

import org.scalatest._
import sequences.ArithmeticGenerator

class ArithmeticGeneratorTest extends FlatSpec with Matchers {

  val testCaseOne = ArithmeticGenerator(0, 1)
  val testCaseTwo = ArithmeticGenerator(0, 5)
  val testCaseRecOne = ArithmeticGenerator(0, 1)
  val testCaseRecTwo = ArithmeticGenerator(0, 5)
  val testCaseZero = ArithmeticGenerator(0, 0)

  "testCaseOne generateSequece" should "generate simple 1,2,3... sequence for n given numbers" in {
    testCaseOne.generateSequenceStr(10) shouldBe "0, 1, 2, 3, 4, 5, 6, 7, 8, 9"
  }

  "testCaseTwo generateSequece" should "generate correct sequence for n given numbers adding fives" in {
    testCaseTwo.generateSequenceStr(5) shouldBe "0, 5, 10, 15, 20"
  }

  "testCaseRecOne generateSequece" should "generate simple 1,2,3... sequence for n given numbers" in {
    testCaseRecOne.generateSequenceRecursive(10, testCaseRecOne.start, testCaseRecOne.diff) shouldBe "0, 1, 2, 3, 4, 5, 6, 7, 8, 9"
  }

  "testCaseRecTwo" should "generate correct sequence for n given numbers adding fives" in {
    testCaseRecTwo.generateSequenceRecursive(5, testCaseRecTwo.start, testCaseRecTwo.diff) shouldBe "0, 5, 10, 15, 20"
  }

  "testCaseZero" should "return start value as a String" in {
    testCaseZero.generateSequenceRecursive(0, testCaseZero.start, testCaseZero.diff) shouldBe testCaseZero.start.toString
  }

  "testCaseOne generateSequenceFunc" should "generate simple 1,2,3... sequence for n given numbers" in {
    testCaseOne.generateSequenceFunc(10) shouldBe "0, 1, 2, 3, 4, 5, 6, 7, 8, 9"
  }

  "testCaseTwo generateSequenceFunc" should "generate correct sequence for n given numbers adding fives" in {
    testCaseTwo.generateSequenceFunc(5) shouldBe "0, 5, 10, 15, 20"
  }
}

