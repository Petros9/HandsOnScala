package BasicScala

object Values extends App {

  // VAL and VAR -> uses e.g. primitive types
  val aNumber: Int = 1
  var aNotRecommendedString: String = "not recommended"

  // TUPLES
  val tuple:(Int, Boolean, String) = (1, true, "hello")
  println(tuple._1)
  println(tuple._2)

  val (number, boolean, string) = tuple
  println(number)
  println(string)

  // tuples sizes -> (1 to 22)

  // ARRAYS
  val array = Array[Int](1, 2, 3, 4)
  val sizedArray = Array[Int](10)
  println(array(2))

  // multi-array
  val multiArray = Array[Array[Int]](Array(1, 2), Array(3, 4))

  println(multiArray(0)(0))

  // OPTIONS

  // option represent a value that may/may not exists

  def hello(title: String, firstName: String, lastName: Option[String]): Unit = {
    lastName match {
      case Some(lastName) => println(s"Hello $title, $lastName")
      case None => println(s"Hello $title, $firstName")
    }
  }
  def hello2(name: Option[String]): Unit = {
    for {
      s <- name
    } yield println(s"Hello $s")
  }
  hello2(None) // does nothing
  hello2(Some("Peter"))
  // options with map

  def nameLength(name: Option[String]): Int = {
    name.map(_.length).getOrElse(-1)
  }

  println(nameLength(Some("Peter")))
  println(nameLength(None))
}
