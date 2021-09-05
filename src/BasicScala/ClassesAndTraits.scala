package BasicScala

object ClassesAndTraits extends App {

  // CLASSES

  class Foo(x: Int) {
    def printMsg(msg: String): Unit = {
      println(msg + x)
    }
  }

  val f = new Foo(1)
  f.printMsg("qwerty")

  // f.x does not compile, to make it publicly accessible:
  class NewFoo(val x: Int) {
    def printMsg(msg: String): Unit = {
      println(msg + x)
    }
  }

  val nF = new NewFoo(1)
  nF.printMsg("qwerty")
  println(nF.x) // works

  // you can use fields as well

  class Baz(x: Int) {
    val bangs = "!" * x
    def printMsg(msg: String): Unit = {
      println(msg + x)
    }
  }
  val baz = new Baz(3)
  baz.printMsg("hello")


  // TRAITS - similar to interfaces
  trait Point{
    def hypotenuse: Double
  }
  class Point2D(x: Double, y: Double) extends Point {
    override def hypotenuse: Double = math.sqrt(x * x + y * y)
  }
  class Point3D(x: Double, y: Double, z: Double) extends Point {
    override def hypotenuse: Double = math.sqrt(x * x + y * y + z * z)
  }


  def flexibleFizzBuzz(f: String => Unit): String => Unit = {
    f
  }
  //flexibleFizzBuzz(s => {})
  //flexibleFizzBuzz(s => println(s))

  var i = 0
  val output = new Array[String](100)
  flexibleFizzBuzz{s =>
  output(i) = s
  i += 1
  }
  output.foreach(println)
}
