// Last updated: 14/07/2026, 14:02:14
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                arr[count++]=nums[i];
            }
            continue;
        }
        for(int j=0;j<n;j++){
            nums[j]=arr[j];
        }
    }
}