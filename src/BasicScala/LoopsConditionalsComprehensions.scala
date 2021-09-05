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
}
