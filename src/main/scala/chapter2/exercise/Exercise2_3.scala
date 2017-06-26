package chapter2.exercise

/**
  * Created by nyakokishi on 2017/6/25.
  */
object Exercise2_3 {
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a: A) => f(a, _)
  }
}
