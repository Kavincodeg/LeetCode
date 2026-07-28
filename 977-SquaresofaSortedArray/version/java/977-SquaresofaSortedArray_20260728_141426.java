// Last updated: 28/07/2026, 14:14:26
1import java.util.*;
2class Solution {
3    public int[] sortedSquares(int[] nums) {
4        for(int i=0;i<nums.length;i++){
5            nums[i]*=nums[i];
6        }
7        Arrays.sort(nums);
8        return nums;
9    }
10}