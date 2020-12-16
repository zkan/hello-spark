def getNearestNeighborsOf(x: Int, numberOfNeighbors: Int, numberList: List[Int]): List[Int] = {
  val distances = numberList.zipWithIndex.map(n => (n._2, (n._1 - x).abs))
  val sortedDistances = distances.sortBy(_._2)
  val pairsOfNearestNeighbours = sortedDistances.take(numberOfNeighbors)
  val idsOfNearestNeighbours = pairsOfNearestNeighbours.map(p => p._1)
  idsOfNearestNeighbours map numberList
}

val x: Int = 8
val numberOfNeighbors: Int = 3
val numberList: List[Int] = List(3, 1, 6, 5, 9, 11, 2, 10)
getNearestNeighborsOf(x, numberOfNeighbors, numberList)