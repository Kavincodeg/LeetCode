// Last updated: 29/07/2026, 11:33:19
1import java.util.*;
2class Solution {
3    public int findMaxLength(int[] nums) {
4        HashMap<Integer, Integer> map = new HashMap<>();
5        map.put(0, -1);
6        int sum = 0;
7        int max = 0;
8        for (int i = 0; i < nums.length; i++) {
9            if (nums[i] == 0)
10                sum--;
11            else
12                sum++;
13            if (map.containsKey(sum)) {
14                max = Math.max(max, i - map.get(sum));
15            } else {
16                map.put(sum, i);
17            }
18        }
19        return max;
20    }
21}