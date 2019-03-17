package sequencesTests

import org.scalatest._
import sequences.GeometricGenerator

class GeometricGeneratorTest extends FlatSpec with Matchers {

  val testCaseOneA = GeometricGenerator(2, 1)
  val testCaseOneB = GeometricGenerator(2, 2)
  val testCaseOneC = GeometricGenerator(1, 2)
  val testCaseTwo = GeometricGenerator(2, 5)

  val testCaseRecOne = GeometricGenerator(2, 1)
  val testCaseRecTwo = GeometricGenerator(2, 2)
  val testCaseRecThree = GeometricGenerator(2, 5)

  val testCaseZero = GeometricGenerator(0, 0)


  "testCaseOneA generateSequence" should "generate simple (i * n) sequence for n given numbers" in {
    testCaseOneA.generateSequenceStr(10) shouldBe "2, 2, 2, 2, 2, 2, 2, 2, 2, 2"
  }

  "testCaseOneB generateSequence" should "generate simple (i * n) sequence for n given numbers" in {
    testCaseOneB.generateSequenceStr(3) shouldBe "2, 4, 8"
  }

  "testCaseOneC generateSequence" should "throw exception given 0 value start argument " in {
    testCaseOneC.generateSequenceStr(5) shouldBe "1, 2, 4, 8, 16"
  }

  "generateSequence" should "generate correct sequence for n given numbers multiplied by five" in {
    testCaseTwo.generateSequenceStr(3) shouldBe "2, 10, 50"
  }

  "testCaseRecOne generateSequenceRecursive" should "generate simple (i * n) sequence for n given numbers" in {
    testCaseRecOne.generateSequenceRecursive(10, testCaseRecOne.start, testCaseRecOne.diff) shouldBe "2, 2, 2, 2, 2, 2, 2, 2, 2, 2"
  }

  "testCaseRecTwo generateSequence" should "generate simple (i * n) sequence for n given numbers" in {
    testCaseRecTwo.generateSequenceRecursive(3, testCaseRecTwo.start, testCaseRecTwo.diff) shouldBe "2, 4, 8"
  }

  "testCaseRecThree" should "generate correct sequence for n given numbers multiplied by five" in {
    testCaseRecThree.generateSequenceRecursive(3, testCaseRecThree.start, testCaseRecThree.diff) shouldBe "2, 10, 50"
  }

  "testCaseZero" should "return start value as a String" in {
    testCaseZero.generateSequenceRecursive(0, testCaseZero.start, testCaseZero.diff) shouldBe testCaseZero.start.toString
  }

  "testCaseOneA generateSequenceFunc" should "generate simple (i * n) sequence for n given numbers" in {
    testCaseOneA.generateSequenceFunc(10) shouldBe "2, 2, 2, 2, 2, 2, 2, 2, 2, 2"
  }

  "testCaseOneB generateSequenceFunc" should "generate simple (i * n) sequence for n given numbers" in {
    testCaseOneB.generateSequenceFunc(3) shouldBe "2, 4, 8"
  }

  "testCaseOneC generateSequenceFunc" should "throw exception given 0 value start argument " in {
    testCaseOneC.generateSequenceFunc(5) shouldBe "1, 2, 4, 8, 16"
  }


}
