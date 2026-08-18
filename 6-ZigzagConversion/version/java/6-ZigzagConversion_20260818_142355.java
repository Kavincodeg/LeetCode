// Last updated: 18/08/2026, 14:23:55
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int[] res=new int[m+n];
4        for(int i=0;i<m;i++){
5            res[i]=nums1[i];
6        }
7        int temp=0;
8        for(int i=m;i<m+n;i++){
9            res[i]=nums2[temp];
10            temp++;
11        }
12        Arrays.sort(res);
13        for(int i=0;i<m+n;i++){
14            nums1[i]=res[i];
15        }
16    }
17}