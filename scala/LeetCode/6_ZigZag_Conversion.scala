/*
Write the code that will take a string and make ZigZag conversion given a number of rows
*/

object Solution {
    def convert(s: String, numRows: Int): String = {
        if (s.length < 2 || numRows == 1) return s

        val resultArr = Array.fill(numRows)("")
        var i = 0
        var goingDown = false

        s.foreach(c => {
          resultArr(i) = resultArr(i) + c.toString
          if (i == 0 || i == numRows - 1) goingDown = !goingDown
          if (goingDown) i += 1 else i -= 1
        })

        resultArr.mkString("")
    }
}