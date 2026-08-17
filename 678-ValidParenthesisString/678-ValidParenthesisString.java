// Last updated: 17/08/2026, 11:33:38
class Solution {
    public boolean checkValidString(String s) {
        int min=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                min++;
                max++;
            }else if(ch==')'){
                min--;
                max--;
            }else if(ch=='*'){
                min--;
                max++;
            }
            min=Math.max(min,0);
            if(max<0){
                return false;
            }
        }
        return min==0;
    }
}