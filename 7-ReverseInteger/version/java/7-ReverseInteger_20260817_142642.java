// Last updated: 17/08/2026, 14:26:42
1class Solution {
2    public int reverse(int x) {
3        int res = 0;
4        int c = 0;
5        if(x < 0) {
6            x = 0 - x;
7            c = 1;
8        }
9        while(x > 0) {
10            int temp = x % 10;
11            if(res > Integer.MAX_VALUE / 10 ||
12               (res == Integer.MAX_VALUE / 10 && temp > 7)) {
13                return 0;
14            }
15            res = res * 10 + temp;
16            x = x / 10;
17        }
18        if(c == 1) {
19            return -res;
20        }
21        else {
22            return res;
23        }
24    }
25}