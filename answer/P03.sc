object P03 {
  def nth[T](i: Int, list: List[T]): T =  {
    val l = list.length
    if(i < l){
      list(i)
    } else{
      sys.error("値が大きすぎる")
    }
  }
}


List(6,7,8,9)(2)

P03.nth(2, List(6,7,8,9))

object P03_2 {
  def nth[T](i: Int, ls: List[T]): T = (i, ls) match {
    case (0, h :: _ ) => h
    case (i, _ :: tail) => nth(i-1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}

P03_2.nth(3, List(6,7,8,9,10))