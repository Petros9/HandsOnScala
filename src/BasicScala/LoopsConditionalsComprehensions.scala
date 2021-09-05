package BasicScala

object LoopsConditionalsComprehensions extends App {

  // FOR
  var total = 0
  val items = Array(1, 10, 100, 1000)

  for(item <- items) total += item
  println(total)

  for(i <- 1 to 5) {
    println(s"Processing $i")
  }

  val multiArray = Array[Array[Int]](Array(1, 2, 3), Array(4, 5, 6))
  for (arr <- multiArray; i <- arr) println(i) // prints 1, 2, 3, 4, 5, 6

  // for with guards
  for(arr <- multiArray; i <- arr; if i % 2 == 0) println(i) // prints 2, 4, 6

  var totalIf = 0
  for (x <- 1 to 10) {
    if(x % 2 ==0) totalIf += x
    else totalIf += 2
  }
  println(totalIf)

  for(i <- Range.inclusive(1, 10)) {
    println(
      if(i % 2 == 0) println("Even")
      else println("Odd")
    )
  }

  // COMPREHENSIONS
  val comprehensionArray = Array(1, 2, 3, 4)
  val comprehensionArray2 = for {
    i <- comprehensionArray
  } yield i * i

  val filteredComprehensionArray = for {
    i <- comprehensionArray if i % 2 == 0
  } yield i * i

  println(comprehensionArray.mkString)
  println(comprehensionArray2.mkString)
  println(filteredComprehensionArray.mkString)

  // concatenation
  val numbers = Array(1, 2, 3)
  val strings = Array("hello", "world", "scala")
  val concatenated = for {
    n <- numbers
    s <- strings
  } yield n + s
  concatenated.foreach(elem => println(elem))
}
