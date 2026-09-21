// Last updated: 21/09/2026, 17:46:57
1class Solution {
2    private void swap(int[] arr, int i, int j) {
3        int temp = arr[i];
4        arr[i] = arr[j];
5        arr[j] = temp;
6    }
7    public int firstMissingPositive(int[] nums) {
8        int n = nums.length;
9        for (int i = 0; i < n; i++) {
10            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
11                swap(nums, i, nums[i] - 1);
12            }
13        }
14        for (int i = 0; i < n; i++) {
15            if (nums[i] != i + 1) {
16                return i + 1;
17            }
18        }
19        return n + 1;
20    }
21}
22