// Last updated: 10/08/2026, 11:38:20
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int leftmax=nums[0];
4        int max=nums[0];
5        int ind=1;
6        for(int i=1;i<nums.length;i++){
7            max=Math.max(nums[i],max);
8            if(nums[i]<leftmax){
9                leftmax=max;
10                ind=i+1;
11            }
12        }
13        return ind;
14    }
15}