// Last updated: 12/09/2026, 12:03:51
1import java.util.*;
2class Solution {
3    public int maximumUniqueSubarray(int[] nums) {
4        HashSet<Integer> set = new HashSet<>();
5        int left = 0;
6        int sum = 0;
7        int max = 0;
8        for (int right = 0; right < nums.length; right++) {
9            while (set.contains(nums[right])) {
10                set.remove(nums[left]);
11                sum -= nums[left];
12                left++;
13            }
14            set.add(nums[right]);
15            sum += nums[right];
16            max = Math.max(max, sum);
17        }
18        return max;
19    }
20}