// Last updated: 17/08/2026, 11:32:59
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;
        int min = 0;
        int maxSum = 0;
        int minSum = 0;
        for (int i = 0; i < nums.length; i++) {
            maxSum += nums[i];
            if (maxSum > max) {
                max = maxSum;
            }
            if (maxSum < 0) {
                maxSum = 0;
            }
            minSum += nums[i];
            if (minSum < min) {
                min = minSum;
            }
            if (minSum > 0) {
                minSum = 0;
            }
        }
        return Math.max(max, Math.abs(min));
    }
}