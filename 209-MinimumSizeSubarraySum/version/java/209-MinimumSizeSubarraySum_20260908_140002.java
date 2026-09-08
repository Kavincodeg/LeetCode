// Last updated: 08/09/2026, 14:00:02
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0;
4        int sum = 0;
5        int min = Integer.MAX_VALUE;
6        for (int right = 0; right < nums.length; right++) {
7            sum += nums[right];
8            while (sum >= target) {
9                int len = right - left + 1;
10                min = Math.min(min, len);
11                sum -= nums[left];
12                left++;
13            }
14        }
15        return min == Integer.MAX_VALUE ? 0 : min;
16    }
17}