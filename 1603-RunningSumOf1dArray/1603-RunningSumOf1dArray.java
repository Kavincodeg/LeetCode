// Last updated: 17/08/2026, 11:33:01
class Solution {
    public int[] runningSum(int[] nums) {
        int ind=1;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}