// Last updated: 14/07/2026, 14:03:01
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        for(char ch: s.toCharArray()){
            c++;
            if(ch==' '){
                c=0;
            }
        }
        return c;
    }
}