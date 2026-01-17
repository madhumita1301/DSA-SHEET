class Solution {
    int[] count;
    int[][] arr;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; 
            arr[i][1] = i;      
        }

        mergeSort(0, n - 1);

        List<Integer> ans = new ArrayList<>();
        for (int c : count) ans.add(c);
        return ans;
    }

    private void mergeSort(int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {
        int[][] temp = new int[right - left + 1][2];
        int i = left, j = mid + 1, k = 0;
        int rightCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i][0] <= arr[j][0]) {
                count[arr[i][1]] += rightCount;
                temp[k++] = arr[i++];
            } else {
                rightCount++;
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            count[arr[i][1]] += rightCount;
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }
    }
}
