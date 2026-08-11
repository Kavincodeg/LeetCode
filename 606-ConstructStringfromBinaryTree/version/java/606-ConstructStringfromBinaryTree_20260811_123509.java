// Last updated: 11/08/2026, 12:35:09
1class Solution {
2    public int calculate(String s) {
3        int sum = 0;
4        int num = 0;
5        int last = 0;
6        char sign = '+';
7        for(int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9            if(ch >= '0' && ch <= '9') {
10                num = num * 10 + (ch - '0');
11            }
12            if((ch < '0' || ch > '9') && ch != ' ' || i == s.length() - 1) {
13                if(sign == '+') {
14                    sum += last;
15                    last = num;
16                }
17                else if(sign == '-') {
18                    sum += last;
19                    last = -num;
20                }
21                else if(sign == '*') {
22                    last = last * num;
23                }
24                else if(sign == '/') {
25                    last = last / num;
26                }
27                sign = ch;
28                num = 0;
29            }
30        }
31        sum += last;
32        return sum;
33    }
34}