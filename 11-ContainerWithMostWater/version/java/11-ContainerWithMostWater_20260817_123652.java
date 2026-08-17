// Last updated: 17/08/2026, 12:36:52
1import java.util.*;
2class Solution {
3    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
4        int[] res = new int[nums1.length + nums2.length];
5        int ind = 0;
6        for(int num : nums1) {
7            res[ind] = num;
8            ind++;
9        }
10        for(int num : nums2) {
11            res[ind] = num;
12            ind++;
13        }
14        Arrays.sort(res);
15        int n = res.length;
16        if(n % 2 == 1) {
17            return res[n / 2];
18        }
19        else {
20            return (res[n / 2 - 1] + res[n / 2]) / 2.0;
21        }
22    }
23}