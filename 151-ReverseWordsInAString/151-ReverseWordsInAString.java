// Last updated: 27/07/2026, 11:50:21
class Solution {
    public String reverseWords(String s) {
        String res="";
        String[] arr=s.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            res+=arr[i];
            res+=" ";
        }
        return res.trim();
    }
}