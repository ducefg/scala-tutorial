package week01

object SquareRoot {
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {
  
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough2(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    // cannot work with very small number and very large number
    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) < 0.001

    def isGoodEnough2(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(5)                                         //> res1: Double = 2.2360688956433634
  sqrt(1e-6)                                      //> res2: Double = 0.0010000001533016628
  sqrt(1e60)                                      //> res3: Double = 1.0000788456669446E30
}