// Last updated: 07/09/2026, 11:25:46
1import java.util.*;
2class Solution {
3    static int sod(int num) {
4        int sum = 0;
5        while (num > 0) {
6            sum += num % 10;
7            num = num / 10;
8        }
9        return sum;
10    }
11    public int maximumSum(int[] nums) {
12        int[] max = new int[82];
13        Arrays.fill(max, -1);
14        int ans = -1;
15        for (int num : nums) {
16            int digitSum = sod(num);
17            if (max[digitSum] != -1) {
18                ans = Math.max(ans, num + max[digitSum]);
19            }
20            max[digitSum] = Math.max(max[digitSum], num);
21        }
22        return ans;
23    }
24}