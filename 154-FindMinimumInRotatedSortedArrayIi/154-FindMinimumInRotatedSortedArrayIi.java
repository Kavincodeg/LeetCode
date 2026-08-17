// Last updated: 17/08/2026, 11:35:16
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int num:nums){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}