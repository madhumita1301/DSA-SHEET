class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int weight : apple) {
            sum += weight;
        }
        int n = capacity.length;
        Arrays.sort(capacity);
        int boxes = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum -= capacity[i];
            boxes++;
            if (sum <= 0)
                return boxes;
        }
        return boxes;
    }
}