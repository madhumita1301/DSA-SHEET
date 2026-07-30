class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int num : nums)
            st.add(num);

        List<Integer> list = new ArrayList<>(st);
        Collections.sort(list);

        int n = list.size();
        if (n < 3)
            return list.get(n - 1);
        return list.get(n - 3);
    }
}