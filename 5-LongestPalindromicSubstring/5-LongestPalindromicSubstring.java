// Last updated: 17/08/2026, 11:36:10
class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        String mstr=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+max;j<=s.length();j++){
                if(j-i>max && ispalin(s.substring(i,j))){
                    max=j-i;
                    mstr=s.substring(i,j);
                }
            }
        }
        return mstr;
    }
    static boolean ispalin(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}