import scala.collection.mutable.ListBuffer

object DecimalToBinary {

  def convertToBinary(n: Int): String = {
    var x: Int = n
    var binary: String = ""

    while (x > 0) {
      binary = (x % 2).toString.concat(binary)
      x = x / 2
    }
    binary
  }

  def convertToBinaryUsingStack(n: Int): String = {
    var x: Int = n
    val stack: ListBuffer[Int] = ListBuffer()

    while (x > 0) {
      x % 2 +=: stack
      x = x / 2
    }
    stack.mkString
  }


  def convertToBinaryRecursive(n: Int): String = {
    n match {
      case n if n == 0 => "0"
      case n if n >= 0 => recursiveCall(n, Nil)
      case n if n < 0 => "-".concat(recursiveCall(Math.abs(n), Nil))
    }
  }

  private def recursiveCall(n: Int, list: List[Int]): String = if (n > 0) recursiveCall(n / 2, (n % 2) :: list) else list.mkString

  def convertToBinaryFunctional(n: Int): String = {
    n match {
      case n if n == 0 => "0"
      case n if n > 0 => Stream.iterate(n)(_ / 2).takeWhile(_ > 0).map(_ % 2).mkString.reverse
      case n if n < 0 => "-".concat(Stream.iterate(Math.abs(n))(_ / 2).takeWhile(_ > 0).map(_ % 2).mkString.reverse)
    }
  }
}
