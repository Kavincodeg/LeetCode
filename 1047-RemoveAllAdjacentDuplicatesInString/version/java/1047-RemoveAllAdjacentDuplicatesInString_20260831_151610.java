// Last updated: 31/08/2026, 15:16:10
1import java.util.*;
2class Solution {
3    public int calPoints(String[] operations) {
4        Stack<Integer> stack = new Stack<>();
5        for(String ch : operations) {
6            if(ch.equals("C")) {
7                stack.pop();
8            }
9            else if(ch.equals("D")) {
10                stack.push(stack.peek() * 2);
11            }
12            else if(ch.equals("+")) {
13                int last = stack.pop();
14                int second = stack.peek();
15                stack.push(last);
16                stack.push(last + second);
17            }
18            else {
19                stack.push(Integer.parseInt(ch));
20            }
21        }
22        int sum = 0;
23        while(!stack.isEmpty()) {
24            sum += stack.pop();
25        }
26        return sum;
27    }
28}