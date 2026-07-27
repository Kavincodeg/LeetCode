// Last updated: 27/07/2026, 12:32:00
1class Solution {
2    public int maxAbsoluteSum(int[] nums) {
3        int max = 0;
4        int min = 0;
5        int maxSum = 0;
6        int minSum = 0;
7        for (int i = 0; i < nums.length; i++) {
8            maxSum += nums[i];
9            if (maxSum > max) {
10                max = maxSum;
11            }
12            if (maxSum < 0) {
13                maxSum = 0;
14            }
15            minSum += nums[i];
16            if (minSum < min) {
17                min = minSum;
18            }
19            if (minSum > 0) {
20                minSum = 0;
21            }
22        }
23        return Math.max(max, Math.abs(min));
24    }
25}