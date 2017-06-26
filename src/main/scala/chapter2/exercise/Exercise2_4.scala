package chapter2.exercise

/**
  * Created by nyakokishi on 2017/6/25.
  */
object Exercise2_4 {
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }
}
