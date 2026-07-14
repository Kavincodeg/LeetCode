// Last updated: 14/07/2026, 14:02:17
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] parr = new int[n]; 
        int[] sarr = new int[n]; 

        parr[0] = 1;
        sarr[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            parr[i] = nums[i - 1] * parr[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            sarr[i] = nums[i + 1] * sarr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = parr[i] * sarr[i];
        }

        return nums;
    }
}
