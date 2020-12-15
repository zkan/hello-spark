def transformInt(x: Int, f: Int => Int) : Int = {
  f(x)
}

transformInt(3, x => x + 2)
transformInt(5, x => {val y = x * 2; y + y})

val upper = (x: String) => {x.toUpperCase()} : String
upper("hello world")