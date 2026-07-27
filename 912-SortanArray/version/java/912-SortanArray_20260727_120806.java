// Last updated: 27/07/2026, 12:08:06
1class Solution {
2    public int findMin(int[] nums) {
3        int min=nums[0];
4        for(int num:nums){
5            if(num<min){
6                min=num;
7            }
8        }
9        return min;
10    }
11}