// Last updated: 14/07/2026, 14:01:51
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] parr=new int[n]; 
        int[] sarr=new int[n]; 
        parr[0]=nums[0];
        sarr[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            parr[i]=nums[i]+parr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sarr[i]=nums[i]+sarr[i+1];
        }

        for (int i = 0; i < n; i++) {
            if(parr[i]==sarr[i])
                return i;
        }
        return -1;
    }
}