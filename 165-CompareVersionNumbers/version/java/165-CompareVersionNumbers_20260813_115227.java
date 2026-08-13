// Last updated: 13/08/2026, 11:52:27
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] arr1=version1.split("\\.");
4        String[] arr2=version2.split("\\.");
5        int len=Math.min(arr1.length,arr2.length);
6        for(int i=0;i<len;i++){
7            if(Integer.parseInt(arr1[i])==Integer.parseInt(arr2[i])){
8                continue;
9            }else if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i])){
10                return 1;
11            }else if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i])){
12                return -1;
13            }else{
14                return 0;
15            }
16        }
17        for(int i = len; i < arr1.length; i++) {
18            if(Integer.parseInt(arr1[i]) != 0) {
19                return 1;
20            }
21        }
22        for(int i = len; i < arr2.length; i++) {
23            if(Integer.parseInt(arr2[i]) != 0) {
24                return -1;
25            }
26        }
27        return 0;
28    }
29}