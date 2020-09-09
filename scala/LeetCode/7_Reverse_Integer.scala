/*
Given a 32-bit signed integer, reverse digits of an integer.
*/

object Solution {
    def reverse(x: Int): Int = {
        val sign = if ( x < 0) "-" else ""
        scala.util.Try(sign.concat(scala.math.abs(x).toString.reverse).toInt).getOrElse(0)
    }
}