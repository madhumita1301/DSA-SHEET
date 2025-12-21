import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Count frequency of each number
        int[] frequency = new int[2001]; // Since -1000 <= nums[i] <= 1000
        for (int num : nums) {
            frequency[num + 1000]++;
        }

        // Step 2: Create list of unique numbers and sort them
        Integer[] uniqueNums = new Integer[2001];
        for (int i = 0; i < 2001; i++) {
            uniqueNums[i] = i - 1000;
        }

        Arrays.sort(uniqueNums, (a, b) -> {
            if (frequency[a + 1000] == frequency[b + 1000]) {
                return b - a; // If frequencies are equal, sort by descending value
            }
            return frequency[a + 1000] - frequency[b + 1000]; // Otherwise, sort by ascending frequency
        });

        // Step 3: Build result array
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : uniqueNums) {
            int freq = frequency[num + 1000];
            while (freq > 0) {
                result[index++] = num;
                freq--;
            }
        }

        return result;
    }
}
