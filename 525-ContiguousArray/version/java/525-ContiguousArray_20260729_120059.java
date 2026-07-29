// Last updated: 29/07/2026, 12:00:59
1class Solution {
2    public int minMoves(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        int sum = 0;
5        for (int num : nums) {
6            min = Math.min(min, num);
7        }
8        for (int num : nums) {
9            sum += (num - min);
10        }
11        return sum;
12    }
13}