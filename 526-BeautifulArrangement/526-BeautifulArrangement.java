// Last updated: 17/08/2026, 11:33:57
class Solution {
    int res = 0;
    public int countArrangement(int n) {
        if (n == 0) return 0;
        backtrack(1, n, new int[n+1]);
        return res;
    }

    private void backtrack(int pos, int n, int[] usedValueArr) {
        if (pos > n) {
            res++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (usedValueArr[i] == 0 && (pos % i == 0 || i % pos == 0)) {
                usedValueArr[i] = 1;
                backtrack(pos+1, n, usedValueArr);
                usedValueArr[i] = 0;
            }
        }
    }
}