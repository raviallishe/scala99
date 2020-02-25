package easy

import scala.annotation.tailrec

/**
  * Find the last but one element of a list.
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
**/

object P02 extends App {

  def penultimate(list: List[Int]) = {
    val result = getSecondLast(list)
    if(result.isDefined) result.get else throw new Exception("list doesn't have enough elementss")
  }

  @tailrec
  private def getSecondLast(list: List[Int], secondLast: Option[Int] = None): Option[Int] = {
    list match {
      case secondLast :: _ :: Nil => Some(secondLast)
      case _ :: tail => getSecondLast(tail, secondLast)
      case _ => throw new Exception("list doesn't have enough elements")
    }
  }

  println(penultimate(List(1, 1, 2, 3, 5, 8)))
}

//Notes:
//above is the recursive approach
//other ways using the available methods are
//1. list.init.last
//2. list.takeRight(n).head