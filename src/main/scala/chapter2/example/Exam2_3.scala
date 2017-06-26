package chapter2.example

/**
  * Created by nyakokishi on 2017/6/25.
  */
object Exam2_3 {

  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def go(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else go(n + 1)
    }

    go(0)
  }

  def findFirst[A](ss: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def go(n: Int): Int = {
      if (n >= ss.length) -1
      else if (p(ss(n))) n
      else go(n + 1)
    }

    go(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def compare(n: Int): Boolean = {
      if (n + 1 >= as.length) true
      else if (!ordered(as(n), as(n + 1))) false
      else compare(n + 1)
    }

    compare(0)
  }

  def main(args: Array[String]): Unit = {
    val ss = Array("a", "b", "c", "d", "e", "f")
    println(findFirst(ss, "e"))

    val numberArray = Array[Int](1, 2, 3, 4, 7, 10, 14)

    println(findFirst(numberArray, { n: Int => n == 4 }))

    println(isSorted[Int](numberArray, { (a: Int, b: Int) => a < b }))
  }
}
