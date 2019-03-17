package sequences

trait SequenceGenerator {
  def generateSequence(total: Int): List[Int]

  def generateSequenceStr(total: Int): String = generateSequence(total).mkString(", ")

  def generateSequenceRecursive(total: Int, start:Int, diff: Int): String = {
    total match {
      case 0 => start.toString
      case _ => recursiveCall(total, List(start), diff).mkString(", ")
    }
  }

  def recursiveCall(total: Int, list: List[Int], diff: Int): List[Int]

  def generateSequenceFunc(total: Int):String
}
