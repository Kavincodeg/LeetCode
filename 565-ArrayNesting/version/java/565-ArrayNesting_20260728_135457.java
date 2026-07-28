// Last updated: 28/07/2026, 13:54:57
1class Solution {
2    public int arrayNesting(int[] nums) {
3        int max = 0;
4        boolean[] visited = new boolean[nums.length];
5        for(int i = 0; i < nums.length; i++) {
6            if(visited[i])
7                continue;
8            HashSet<Integer> map = new HashSet<>();
9            int ind = i;
10            while(!map.contains(nums[ind])) {
11                map.add(nums[ind]);
12                visited[ind] = true;
13                ind = nums[ind];
14            }
15            max = Math.max(max, map.size());
16        }
17        return max;
18    }
19}