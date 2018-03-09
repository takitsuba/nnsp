object P04 {
  def length[T](ls: List[T]): Int = {
    case Nil       => 0
    case _ :: tail => 1 + length(tail)
  }
}


P04.length(List(1,2,3,4,5))



