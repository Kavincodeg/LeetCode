// Last updated: 18/08/2026, 14:45:18
class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c==ch){
                ind=i;
                break;
            }
        }
        String res="";
        for(int i=ind;i>=0;i--){
            res+=word.charAt(i);
        }
        for(int i=ind+1;i<word.length();i++){
            res+=word.charAt(i);
        }
        return res;
    }
}