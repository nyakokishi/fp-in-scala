package chapter2.example

/**
  * Created by nyakokishi on 2017/6/25.
  */
object MyModule {

  def abs(n: Int): Int = {
    if (n < 0) -n else n
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, acc * n)
    }

    go(n, 1)
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(x: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(x, factorial(x))
  }

  private def formatResult(format: String, x: Int, f: Int => Int) = {
    val msg = s"The $format of %d is %d"
    msg.format(x, f(x))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-9))
    println(formatFactorial(5))

    println(formatResult("factorial", 5, factorial))
    println(formatResult("absolute value", -100, abs))
  }

}