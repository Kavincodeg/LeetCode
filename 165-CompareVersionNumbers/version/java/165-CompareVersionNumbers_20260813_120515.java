// Last updated: 13/08/2026, 12:05:15
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> st = new Stack<>();
4        Stack<StringBuilder> st1 = new Stack<>();
5        StringBuilder sb = new StringBuilder();
6        int n = 0;
7        for (char c : s.toCharArray()) {
8            if (Character.isDigit(c)) {
9                n = n * 10 + (c - '0');
10            } else if (c == '[') {
11                st.push(n);
12                n = 0;
13                st1.push(sb);
14                sb = new StringBuilder();
15            } else if (c == ']') {
16                int k = st.pop();
17                StringBuilder temp = sb;
18                sb = st1.pop();
19                while (k-- > 0) {
20                    sb.append(temp);
21                }
22            } else {
23                sb.append(c);
24            }
25        }
26        return sb.toString();
27    }
28}