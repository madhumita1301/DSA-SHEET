class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // Ensure that the length of the array is at least 3
        if (arr.length < 3) {
            return false;
        }

        // Iterate over the array starting from the 2nd index
        for (int i = 2; i < arr.length; i++) {
            // Check if the current element and the two previous elements are all odd
            if (arr[i] % 2 != 0 && arr[i - 1] % 2 != 0 && arr[i - 2] % 2 != 0) {
                return true;
            }
        }

        return false;
    }
}
