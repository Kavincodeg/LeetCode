// Last updated: 18/08/2026, 14:47:11
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int ind = 0;
        for(int num : nums1) {
            res[ind] = num;
            ind++;
        }
        for(int num : nums2) {
            res[ind] = num;
            ind++;
        }
        Arrays.sort(res);
        int n = res.length;
        if(n % 2 == 1) {
            return res[n / 2];
        }
        else {
            return (res[n / 2 - 1] + res[n / 2]) / 2.0;
        }
    }
}