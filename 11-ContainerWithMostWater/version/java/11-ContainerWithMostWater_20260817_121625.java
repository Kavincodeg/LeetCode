// Last updated: 17/08/2026, 12:16:25
1class Solution{
2    public long numberOfWays(String s){
3        int zero = 0;
4        long zeroOne = 0;
5        int one = 0;
6        long oneZero = 0;
7        long tot = 0;
8        for(char ch : s.toCharArray()){
9            if(ch == '0'){
10                zero++;
11                oneZero += one;
12                tot += zeroOne;
13            }
14            else{
15                one++;
16                zeroOne += zero;
17                tot += oneZero;
18            }
19        }
20        return tot;
21    }
22}