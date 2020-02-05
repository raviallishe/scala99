package easy


//P01 (*) Find the last element of a list.

object P01 extends App {

  def last(list: List[Int]) = {
    // list.last gives O(n) as it is singly forward linked list
    // IndexedSeq can be used for O(1)
    list.last
  }

  println("last element: " + last(List(1, 1, 2, 3, 5, 8)))

}
