package chapter2.exercise

/**
  * Created by nyakokishi on 2017/6/25.
  */
object Exercise2_1 extends App {
  def fib(n: Int): Int = {
//    @annotation.tailrec
    def go(n: Int): Int = {

      n match {
        case 2 => 1
        case 1 => 0
        case _ => go(n - 1) + go(n - 2)
      }
    }

    go(n)
  }

  println(fib(7))
}
