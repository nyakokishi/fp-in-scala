package chapter2.exercise

/**
  * Created by nyakokishi on 2017/6/25.
  */
object Exercise2_2 {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      if (n + 1 >= as.length) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 3, 5, 7, 8, 3, 2, 12)
    val orderedNumbers = Array[Float](1, 2, 4, 5, 6, 9, 9.8f)

    println(isSorted(numbers, { (a: Int, b: Int) => a < b }))
    println(isSorted(orderedNumbers, (a: Float, b: Float) => a < b ))

  }

}
