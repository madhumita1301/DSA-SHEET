public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int st = 1, end = n;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
}
