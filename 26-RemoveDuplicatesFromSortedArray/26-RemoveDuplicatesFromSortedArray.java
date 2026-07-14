// Last updated: 14/07/2026, 14:03:13
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int c = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[c - 1]) {
                nums[c] = nums[i];
                c++;
            }
        }

        return c;        
    }
}