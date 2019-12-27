val lst = List[Option[Int]](Option[Int](1)
  , Option[Int](2), None)

def flatten(options: List[Option[Int]]): List[Int] = {
  options.flatten
}

flatten(lst)