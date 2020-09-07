/*
Given a string s, find the length of the longest substring without repeating characters.
*/

object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
    if (s.length == 0) return 0

    // Use a temp string to store the substring without repeating Characters
    var tempStr = ""
    var maxLength = 0

    s.foreach(eachChar => {
      if (tempStr.contains(eachChar)) {
        // If temp string contains the current character, remove the previous which contains eachChar
        tempStr = tempStr.drop(tempStr.indexOf(eachChar) + 1) + eachChar
      } else {
        // Append eachChar to the end of temp String and update maxLength
        tempStr = tempStr + eachChar
        if (tempStr.length > maxLength) maxLength = tempStr.length
      }
    })

    maxLength
  }
}