// Last updated: 10/08/2026, 11:55:37
1import java.util.*;
2class Solution {
3    public boolean isPossible(int[] nums) {
4        HashMap<Integer, Integer> map = new HashMap<>();
5        HashMap<Integer, Integer> seq = new HashMap<>();
6        for(int num : nums) {
7            map.put(num, map.getOrDefault(num, 0) + 1);
8        }
9        for(int i = 0; i < nums.length; i++) {
10            int num = nums[i];
11            if(map.get(num) == 0)
12                continue;
13            if(seq.getOrDefault(num, 0) > 0) {
14                seq.put(num, seq.get(num) - 1);
15                seq.put(num + 1,seq.getOrDefault(num + 1, 0) + 1);
16                map.put(num, map.get(num) - 1);
17            }
18            else if(map.getOrDefault(num + 1, 0) > 0 && map.getOrDefault(num + 2, 0) > 0) {
19                map.put(num, map.get(num) - 1);
20                map.put(num + 1, map.get(num + 1) - 1);
21                map.put(num + 2, map.get(num + 2) - 1);
22                seq.put(num + 3, seq.getOrDefault(num + 3, 0) + 1);
23            }
24            else {
25                return false;
26            }
27        }
28        return true;
29    }
30}