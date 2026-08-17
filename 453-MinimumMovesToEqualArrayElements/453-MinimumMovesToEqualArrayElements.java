// Last updated: 17/08/2026, 11:34:07
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            sum += (num - min);
        }
        return sum;
    }
}