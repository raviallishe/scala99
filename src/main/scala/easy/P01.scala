package easy


//P01 (*) Find the last element of a list.

object P01 extends App {

  def last(list: List[Int]) = {
    // list.last gives O(n) as it is singly forward linked list
    // IndexedSeq can be used for O(1) if you know the size -> https://docs.scala-lang.org/tutorials/FAQ/collections.html
    // also if it's a doubley linked list then it's O(1) for front and back elements
    //In scala there is only mutable doubly linked list : https://stackoverflow.com/questions/8042356/why-no-immutable-double-linked-list-in-scala-collections
    list.last
  }

  println("last element: " + last(List(1, 1, 2, 3, 5, 8)))

}
