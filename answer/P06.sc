object P06 {
  def isPalindrome[T](ls: List[T]): Boolean = {
    case h :: naka :: tail => (h==tail) * naka
    case _ :: tail => 1 + length(tail)
  }
}