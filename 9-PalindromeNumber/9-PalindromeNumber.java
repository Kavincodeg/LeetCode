// Last updated: 14/07/2026, 14:03:19
class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int res=0;
        while(x>0){
            int temp=x%10;
            res=(res*10) + temp;
            x=x/10;
        }
        if(org==res){
            return true;
        }return false;
    }
}