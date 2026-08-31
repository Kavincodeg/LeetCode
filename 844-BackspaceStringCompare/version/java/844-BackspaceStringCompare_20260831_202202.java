// Last updated: 31/08/2026, 20:22:02
1import java.util.*;
2class Solution {
3    public boolean backspaceCompare(String s, String t) {
4        Stack<Character> map1 = new Stack<>();
5        Stack<Character> map2 = new Stack<>();
6        for (char ch : s.toCharArray()) {
7            if (ch == '#') {
8                if (!map1.isEmpty()) {
9                    map1.pop();
10                }
11            } else {
12                map1.push(ch);
13            }
14        }
15        for (char ch : t.toCharArray()) {
16            if (ch == '#') {
17                if (!map2.isEmpty()) {
18                    map2.pop();
19                }
20            } else {
21                map2.push(ch);
22            }
23        }
24        String str1 = "";
25        String str2 = "";
26        while (!map1.isEmpty()) {
27            str1 += map1.pop();
28        }
29        while (!map2.isEmpty()) {
30            str2 += map2.pop();
31        }
32        String res1 = new StringBuilder(str1).reverse().toString();
33        String res2 = new StringBuilder(str2).reverse().toString();
34        return res1.equals(res2);
35    }
36}