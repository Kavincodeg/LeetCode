// Last updated: 18/08/2026, 14:45:21
class Solution{
    public long numberOfWays(String s){
        int zero = 0;
        long zeroOne = 0;
        int one = 0;
        long oneZero = 0;
        long tot = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                zero++;
                oneZero += one;
                tot += zeroOne;
            }
            else{
                one++;
                zeroOne += zero;
                tot += oneZero;
            }
        }
        return tot;
    }
}