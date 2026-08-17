// Last updated: 17/08/2026, 11:35:11
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");
        int len=Math.min(arr1.length,arr2.length);
        for(int i=0;i<len;i++){
            if(Integer.parseInt(arr1[i])==Integer.parseInt(arr2[i])){
                continue;
            }else if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i])){
                return 1;
            }else if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i])){
                return -1;
            }else{
                return 0;
            }
        }
        for(int i = len; i < arr1.length; i++) {
            if(Integer.parseInt(arr1[i]) != 0) {
                return 1;
            }
        }
        for(int i = len; i < arr2.length; i++) {
            if(Integer.parseInt(arr2[i]) != 0) {
                return -1;
            }
        }
        return 0;
    }
}