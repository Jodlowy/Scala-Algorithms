import org.scalatest.Matchers
import org.scalatest._

class DecimalToBinaryTest extends FlatSpec with Matchers {

  "ConvertToBinary" should "return converted binary representation of a number as String" in {
    DecimalToBinary.convertToBinary(183) shouldBe "10110111"
  }

  "ConvertToBinaryUsingStack" should "return converted binary representation of a number as String" in {
    DecimalToBinary.convertToBinaryUsingStack(183) shouldBe "10110111"
  }

  "ConvertToBinaryRecursive" should "return converted binary representation of a number as String" in {
    DecimalToBinary.convertToBinaryRecursive(183) shouldBe "10110111"
  }

  "ConvertToBinaryRecursive" should "return IllegalArgumentException for a non positive number" in {
    an [IllegalArgumentException] should be thrownBy DecimalToBinary.convertToBinaryRecursive(-12)
  }

  "ConvertToBinaryRecursive" should "return binary representation for a 0 value" in {
    DecimalToBinary.convertToBinaryRecursive(0) shouldBe "0"
  }
}
