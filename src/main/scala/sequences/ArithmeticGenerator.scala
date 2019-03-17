package sequences

import scala.collection.mutable.ArrayBuffer

case class ArithmeticGenerator(start: Int, diff: Int) extends SequenceGenerator {
  override def generateSequence(total: Int): List[Int] = {
    val sequence = new ArrayBuffer[Int]
    var n = start
    for (i <- 0 until total) {
      sequence += n
      n += diff
    }
    sequence.toList
  }

  override def recursiveCall(total: Int, list: List[Int], diff: Int): List[Int] = {
    list.length match {
      case len if len < total => recursiveCall(total, (list.head + diff) :: list, diff)
      case _ => list.reverse
    }
  }

  override def generateSequenceFunc(total: Int): String = Stream.iterate(start)(n => n + diff).take(total).mkString(", ")
}
