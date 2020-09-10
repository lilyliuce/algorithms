/*
Implement atoi which converts a string to an integer.
*/

object Solution {
    def myAtoi(str: String): Int = {
        val str1 = str.trim

        if (str1.length == 0) return 0
        if (!str1(0).isDigit && str1(0) != '-' && str1(0) != '+') return 0
        if (str1 == "-" || str1 == "+") return 0

        var i = 1
        while (i < str1.length && str1(i).isDigit) {
          i += 1
        }

        val str2 = str1.slice(0, i)
        if (str2 == "-" || str2 == "+") return 0

        val result = scala.util.Try(str2.toInt).getOrElse(Int.MinValue)

        if (result == Int.MinValue && !str2.contains('-')) return Int.MaxValue

        result
    }
}