// Fibo: Print the first 10 values -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

var currentNumber: Int = 1
var lastNumber: Int = 0
for (i <- 0 until 10) {
  if (i == 0 || i == 1) {
    println(i)
  } else {
    val newNumber: Int = currentNumber + lastNumber
    println(newNumber)
    lastNumber = currentNumber
    currentNumber = newNumber
  }
}

var currentNumber: Int = 1
var lastNumber: Int = 0
for (i <- 0 to 9) {
  i match {
    case 0 | 1 => println(i)
    case _ => {
      val newNumber: Int = currentNumber + lastNumber
      println(newNumber)
      lastNumber = currentNumber
      currentNumber = newNumber
    }
  }
}

var currentNumber: Int = 1
var lastNumber: Int = 0
Array.range(0, 10).map(i => {
  i match {
    case 0 | 1 => println(i)
    case _ => {
      val newNumber: Int = currentNumber + lastNumber
      println(newNumber)
      lastNumber = currentNumber
      currentNumber = newNumber
    }
  }
})