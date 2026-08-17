// Last updated: 17/08/2026, 11:33:16
class Solution {
    public int partitionDisjoint(int[] nums) {
        int leftmax=nums[0];
        int max=nums[0];
        int ind=1;
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max);
            if(nums[i]<leftmax){
                leftmax=max;
                ind=i+1;
            }
        }
        return ind;
    }
}