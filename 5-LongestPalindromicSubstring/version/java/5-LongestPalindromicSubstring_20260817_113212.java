// Last updated: 17/08/2026, 11:32:12
1class Solution {
2    public String longestPalindrome(String s) {
3        int max=1;
4        String mstr=s.substring(0,1);
5        for(int i=0;i<s.length();i++){
6            for(int j=i+max;j<=s.length();j++){
7                if(j-i>max && ispalin(s.substring(i,j))){
8                    max=j-i;
9                    mstr=s.substring(i,j);
10                }
11            }
12        }
13        return mstr;
14    }
15    static boolean ispalin(String str){
16        int l=0;
17        int r=str.length()-1;
18        while(l<r){
19            if(str.charAt(l)!=str.charAt(r)){
20                return false;
21            }
22            l++;
23            r--;
24        }
25        return true;
26    }
27}