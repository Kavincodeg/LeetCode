// Last updated: 17/08/2026, 11:33:52
class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        boolean[] visited = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(visited[i])
                continue;
            HashSet<Integer> map = new HashSet<>();
            int ind = i;
            while(!map.contains(nums[ind])) {
                map.add(nums[ind]);
                visited[ind] = true;
                ind = nums[ind];
            }
            max = Math.max(max, map.size());
        }
        return max;
    }
}