// Last updated: 28/07/2026, 13:50:35
1class Solution {
2    public int arrayNesting(int[] nums) {
3
4        int max = 0;
5        boolean[] visited = new boolean[nums.length];
6
7        for(int i = 0; i < nums.length; i++) {
8
9            if(visited[i])
10                continue;
11
12            HashSet<Integer> map = new HashSet<>();
13
14            int ind = i;
15
16            while(!map.contains(nums[ind])) {
17
18                map.add(nums[ind]);
19                visited[ind] = true;
20                ind = nums[ind];
21            }
22
23            max = Math.max(max, map.size());
24        }
25
26        return max;
27    }
28}