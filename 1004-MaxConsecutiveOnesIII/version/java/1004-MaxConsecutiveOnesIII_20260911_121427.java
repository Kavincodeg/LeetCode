// Last updated: 11/09/2026, 12:14:27
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0, maxLength = 0, zeroCount = 0;
4        for (int right = 0; right < nums.length; ++right) {
5            if (nums[right] == 0) {
6                zeroCount++;
7            }
8            while (zeroCount > k) {
9                if (nums[left] == 0) {
10                    zeroCount--;
11                }
12                left++;
13            }
14            maxLength = Math.max(maxLength, right - left + 1);
15        }
16        return maxLength;
17    }
18}