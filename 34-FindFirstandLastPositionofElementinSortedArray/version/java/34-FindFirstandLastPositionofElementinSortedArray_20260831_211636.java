// Last updated: 31/08/2026, 21:16:36
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] res = {-1, -1};
4        int left = 0;
5        int right = nums.length - 1;
6        while(left <= right) {
7            int mid = left + (right - left) / 2;
8            if(nums[mid] == target) {
9                res[0] = mid;
10                right = mid - 1;
11            }
12            else if(nums[mid] < target) {
13                left = mid + 1;
14            }
15            else {
16                right = mid - 1;
17            }
18        }
19        left = 0;
20        right = nums.length - 1;
21        while(left <= right) {
22            int mid = left + (right - left) / 2;
23            if(nums[mid] == target) {
24                res[1] = mid;
25                left = mid + 1;
26            }
27            else if(nums[mid] < target) {
28                left = mid + 1;
29            }
30            else {
31                right = mid - 1;
32            }
33        }
34        return res;
35    }
36}