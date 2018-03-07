object P01 {
  def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case x :: xs  => last(xs)
    case _        => sys.error("last isn't defined for empty list")
  }
}


val a = P01

a.last(List(1,2,3,4))

a.last(List("taro","jiro"))

a.last(List("taro",2))

3 :: Nil

a.last(List(Nil))