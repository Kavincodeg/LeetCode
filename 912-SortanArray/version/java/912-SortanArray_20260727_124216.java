// Last updated: 27/07/2026, 12:42:16
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int ind=1;
4        int sum=nums[0];
5        for(int i=1;i<nums.length;i++){
6            sum+=nums[i];
7            nums[i]=sum;
8        }
9        return nums;
10    }
11}