// 2nd APPROACH USING NEXT GREATER ELEMENT
 
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n - 1);
        nge[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && nums[i] > nums[st.peek()])
                st.pop();
            if (st.size() == 0)
                nge[i] = n;
            else
                nge[i] = st.peek();
            st.push(i); // mandatory to push the element at the last
        }
        int j = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (j >= i + k)
                j = i;
            int max = nums[j];
            while (j < i + k) {
                max = nums[j];
                j = nge[j];
            }
            ans[z++] = max;
        }
        return ans;
    }
}


// APPROACH 1 --> BRUTE FORCE METHOD
// 1st for loop (n-k+1) times
// 2nd for loop (k) times --> TC =O(K*N)
// if there are a total of k elements in the nums array then the last 2 elements
// that is
// k and k-1 element wont be able to become the starting elements for the
// sliding window
// therefore length of the answer array will be equals to n-(k-1) = n-k+1