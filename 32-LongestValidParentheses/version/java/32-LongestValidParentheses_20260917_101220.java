// Last updated: 17/09/2026, 10:12:20
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> stack = new Stack<>();
4        stack.push(-1);
5        int max_len = 0;
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '(') {
8                stack.push(i);
9            } else {
10                stack.pop();
11                if (stack.isEmpty()) {
12                    stack.push(i);
13                } else {
14                    max_len = Math.max(max_len, i - stack.peek());
15                }
16            }
17        }
18        return max_len;        
19    }
20}