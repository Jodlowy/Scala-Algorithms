package sequences

import scala.collection.mutable.ArrayBuffer

case class Fibonacci(total: Int) {

  def generate: String = {
    val arr = ArrayBuffer(0, 1)

    for (n <- 2 until total) {
      arr += (arr(n - 1) + arr(n - 2))
    }
    arr.mkString(", ")
  }

  def generateRecursively: String = {
    def recCall(list: List[Int]): List[Int] = if (list.length == total) list else recCall((list.head + list.tail.head) :: list)

    recCall(List(1, 1, 0)).reverse.mkString(", ")
  }

  def generateFunc: String = {
    lazy val fibs: Stream[Int] = 0 #:: fibs.scanLeft(1)(_ + _)
    fibs.take(total).mkString(", ")
  }
}

