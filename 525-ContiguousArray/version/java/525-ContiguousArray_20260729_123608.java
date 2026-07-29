// Last updated: 29/07/2026, 12:36:08
1class Solution {
2    public int minMoves(int[] nums) {
3        Arrays.sort(nums);
4        int sum = 0;
5        int min=nums[0];
6        for (int num : nums) {
7            sum += (num - min);
8        }
9        return sum;
10    }
11}