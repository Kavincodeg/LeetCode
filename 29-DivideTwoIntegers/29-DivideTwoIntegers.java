// Last updated: 14/07/2026, 14:03:10
class Solution {
    public int divide(int dividend, int divisor) {
        int res=dividend/divisor;
        if(dividend== Integer.MIN_VALUE && divisor==-1){
            res= Integer.MAX_VALUE;
        }
        return res;
    }
}