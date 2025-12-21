/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // Step 1: Find the peak index using binary search
        int peakIndex = findPeakIndex(mountainArr, n);
        
        // Step 2: Search for the target in the first half of the mountain array
        int index = binarySearchAscending(mountainArr, target, 0, peakIndex);
        if (index != -1) {
            return index;
        }
        
        // Step 3: If not found in the first half, search in the second half (descending part)
        return binarySearchDescending(mountainArr, target, peakIndex + 1, n - 1);
    }
    
    // Helper method to find the peak index using binary search
    private int findPeakIndex(MountainArray mountainArr, int n) {
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left; // or return right, they will be the same at this point
    }
    
    // Binary search in ascending order segment of mountain array
    private int binarySearchAscending(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    // Binary search in descending order segment of mountain array
    private int binarySearchDescending(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}
