package chapter2.exercise

/**
  * Created by nyakokishi on 2017/6/25.
  */
object Exercise2_5 {
  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
    //      f compose g
    //    g andThen f
  }
}
