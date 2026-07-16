// Last updated: 16/07/2026, 11:55:44
1class Solution {
2    public int search(int[] nums, int target) {
3        int ind=-1;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                ind=i;
7            }
8        }
9        return ind;
10    }
11}