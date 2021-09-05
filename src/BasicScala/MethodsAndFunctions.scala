package BasicScala

import scala.annotation.tailrec

object MethodsAndFunctions extends App {


  @tailrec
  def helloWorldNTimes(numbers: Int): Unit = {
    if(numbers != 0)
      println("hello")
    if(numbers != 0) {
      helloWorldNTimes(numbers - 1)
    }
  }

  helloWorldNTimes(3)
  println("#")
  helloWorldNTimes(0)
  println("#")

  // DEFAULT PARAMETERS
  def helloWorldNTimesWithDefaultParameter(numbers: Int = 1): Unit = {
    if(numbers != 0)
      println("hello")
    if(numbers != 0) {
      helloWorldNTimes(numbers - 1)
    }
  }
  helloWorldNTimesWithDefaultParameter()

  def world(string: String = "default"): String = {
    string
  }
  println(world().reverse)

  // FUNCTION VALUES
  var g: Int => Int = i => i +1
  println(g(13))
  // function values cannot have optional arguments and take parameters via [T] syntax

  // higher order methods -> pass function values into methods that take function parameters
  class Box(var x: Int) {
    def update(f: Int => Int): Unit = x = f(x)
    def printMsg(msg: String): Unit = {
      println(msg + x)
    }
  }
  val box = new Box(5)
  box.printMsg("Hello") // Hello5
  box.update(_ + 5) // x = 5 -> x = 10 box.update(elem => elem + 5) works as well

  def increment(i: Int): Int = i + 1
  box.update(increment)

  // MULTIPLE PARAMETER LISTS

  def myLoop(start: Int, end: Int)(callback: Int => Unit) = {
    for {
      i <- Range(start, end)
    } callback(i)
  }
  myLoop(5, 10)(println)


}
