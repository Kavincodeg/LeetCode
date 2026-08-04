// Last updated: 04/08/2026, 12:11:00
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        int n = s.length();
4        if(s == null || n == 0)
5            return 0;
6        int countOfOnes = 0;
7        int countOfZeros = 0;
8        char[] arr = s.toCharArray();
9        for(int i = 0; i < n; i++){
10            char c = arr[i];
11            if(c == '0'){
12                if(countOfOnes == 0)
13                    continue;
14                else
15                    countOfZeros++;
16            }else
17                countOfOnes++;
18            if(countOfZeros > countOfOnes)
19                countOfZeros = countOfOnes;
20        }
21        return countOfZeros;
22    }
23}