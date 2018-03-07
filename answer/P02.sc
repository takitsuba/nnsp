object P02 {
  def last[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: tail => last(tail)
    case _        => sys.error("last isn't defined for empty list")
  }
}

P02.last(List(3,4,5,6,7))
List(3,4,5,6,7,8)


object P02_2 {
  def last[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: tail => last(tail)
    case _        => sys.error("last isn't defined for empty list")
  }
}