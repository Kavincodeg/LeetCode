// Last updated: 27/07/2026, 12:08:54
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int count = 0;
4        for (int i = 1; i < nums.length; i++) {
5            if (nums[i] < nums[i - 1]) {
6                count++;
7                if (count > 1)
8                    return false;
9                int temp = nums[i];
10                if (i >= 2 && nums[i - 2] > temp) {
11                    nums[i] = nums[i - 1];
12                } else {
13                    nums[i - 1] = temp;
14                }
15            }
16        }
17        return true;
18    }
19}