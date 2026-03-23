// // class Solution {
// //     public int countTriples(int n) {
// //         int ans = 0;
// //         for (int i = 1; i <= n; i++) {
// //             for (int j = i + 1; j <= n; j++) {
// //                 for (int k = j + 1; k <= n; k++) {
// //                     if ((i * i + j * j == k * k)) {
// //                         ans += 2;
// //                     }
// //                 }
// //             }
// //         }
// //         return ans;
// //     }
// // }

// class Solution {
//     public int countTriples(int n) {
//         int ans = 0;
//         for (int a = 1; a <= n; a++) {
//             for (int b = 1; b <= n; b++) {
//                 int sum = a * a + b * b;
//                 int c = (int) Math.sqrt(sum);
//                 if (c * c == sum && c <= n) {
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int countTriples(int n) {
        boolean[] square = new boolean[2 * n * n + 1];
        for (int i = 1; i <= n; i++) {
            square[i * i] = true;
        }
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (square[a * a + b * b]) {
                    count++;
                }
            }
        }
        return count;
    }
}