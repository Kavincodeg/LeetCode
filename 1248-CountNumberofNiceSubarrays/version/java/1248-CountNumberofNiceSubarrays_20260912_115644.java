// Last updated: 12/09/2026, 11:56:44
1import java.util.*;
2class Solution {
3    public int numberOfSubarrays(int[] nums, int k) {
4        int res = 0;
5        int count = 0;
6        int[] freq = new int[nums.length + 1];
7        freq[0] = 1;
8        for (int num : nums) {
9            if (num % 2 != 0) {
10                count++;
11            }
12            if (count >= k) {
13                res += freq[count - k];
14            }
15            freq[count]++;
16        }
17        return res;
18    }
19}