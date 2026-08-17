// Last updated: 17/08/2026, 11:33:41
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1)
                    return false;
                int temp = nums[i];
                if (i >= 2 && nums[i - 2] > temp) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i - 1] = temp;
                }
            }
        }
        return true;
    }
}