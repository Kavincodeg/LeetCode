// Last updated: 18/08/2026, 14:46:46
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        for(int i=0;i<m;i++){
            res[i]=nums1[i];
        }
        int temp=0;
        for(int i=m;i<m+n;i++){
            res[i]=nums2[temp];
            temp++;
        }
        Arrays.sort(res);
        for(int i=0;i<m+n;i++){
            nums1[i]=res[i];
        }
    }
}