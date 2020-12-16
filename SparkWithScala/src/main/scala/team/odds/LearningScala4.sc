val captainStuff = ("Picard", "Enterprise-D")
println(captainStuff._1)
println(captainStuff._2)

val shipList = List("Enterprise", "Defiant", "Voyager")
shipList(0)
shipList(1)
shipList.head // first item
shipList.tail // remaining items beyond the first one

shipList.map((ship: String) => {ship.reverse})

val numberList = List(1, 2, 3, 4, 5)
numberList.reduce((x: Int, y: Int) => {x + y})

val iHateFive = numberList.filter((x: Int) => x != 5)
val iHateThree = numberList.filter(_ != 3)

val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D")
shipMap("Picard")
shipMap.getOrElse("Kan", "Nothing")