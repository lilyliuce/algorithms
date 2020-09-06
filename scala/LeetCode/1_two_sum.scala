/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*/

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        // Create a map which will save the elements in the nums.
        val mapSave = scala.collection.mutable.Map[Int, Int]()

        // Iterate the nums using zipWithIndex function
        for ((value, index) <- nums.zipWithIndex) {
            val diff = target - value

            if (mapSave.contains(diff)) {
                // If the mapSave contains the diff already, return the indices of the value and diff
                return Array(index, mapSave(diff))
            } else {
                // Otherwise, add the value and its index to the map
                mapSave += (value -> index)
            }
        }

        Array(0)
    }
}