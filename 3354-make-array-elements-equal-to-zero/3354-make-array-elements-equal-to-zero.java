class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        // Calculate total sum of all elements
        int total = 0;
        for (int x : nums) {
            total += x;
        }

        int result = 0;
        int leftSum = 0;
        // Traverse array
        for (int x : nums) {
            if (x != 0) {
                // accumulate sum of non-zero elements seen so far
                leftSum += x;
            } else {
                // x == 0 → possible starting position
                // sum on the left side = leftSum
                // sum on the right side = total - leftSum
                int rightSum = total - leftSum;
                if (leftSum == rightSum) {
                    // perfectly balanced → both directions valid
                    result += 2;
                } else if (Math.abs(leftSum - rightSum) == 1) {
                    // difference is exactly 1 → exactly one direction works
                    result += 1;
                }
                // else difference > 1 → no valid direction from this zero
            }
        }
        return result;
    }
}
