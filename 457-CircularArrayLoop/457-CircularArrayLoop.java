// Last updated: 17/08/2026, 11:34:05
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            int curr = i;
            boolean dir = nums[i] > 0;
            while (true) {
                if ((nums[curr] > 0) != dir)
                    break;
                if (visited[curr])
                    return true;
                visited[curr] = true;
                int next = (curr + nums[curr]) % n;
                if (next < 0)
                    next += n;
                if (next == curr)
                    break;
                curr = next;
            }
        }
        return false;
    }
}