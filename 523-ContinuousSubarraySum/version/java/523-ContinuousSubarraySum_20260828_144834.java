// Last updated: 28/08/2026, 14:48:34
1import java.util.*;
2class Solution {
3    public boolean checkSubarraySum(int[] nums, int k) {
4        HashMap<Integer, Integer> map = new HashMap<>();
5        map.put(0, -1);
6        int sum = 0;
7        for(int i = 0; i < nums.length; i++) {
8            sum += nums[i];
9            int rem = sum % k;
10            if(map.containsKey(rem)) {
11                if(i - map.get(rem) >= 2) {
12                    return true;
13                }
14            }
15            else {
16                map.put(rem, i);
17            }
18        }
19        return false;
20    }
21}