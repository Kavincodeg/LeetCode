// Last updated: 20/07/2026, 11:27:11
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5
6        int[][] dp = new int[m + 1][n + 1];
7
8        for(int i = 1; i <= m; i++) {
9            for(int j = 1; j <= n; j++) {
10
11                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
12                    dp[i][j] = dp[i - 1][j - 1] + 1;
13                }
14                else {
15                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
16                }
17            }
18        }
19
20        int c = dp[m][n];
21
22        int delete1 = m - c;
23        int delete2 = n - c;
24
25        return delete1 + delete2;
26    }
27}