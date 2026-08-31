// Last updated: 31/08/2026, 14:47:30
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> map= new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(ch=='(' || ch=='{' || ch=='['){
6                map.push(ch);
7            }else{
8                if(map.isEmpty()){
9                    return false;
10                }
11                char t=map.pop();
12                if(ch==')' && t!='('){
13                    return false;
14                }
15                if(ch=='}' && t!='{'){
16                    return false;
17                }
18                if(ch==']' && t!='['){
19                    return false;
20                }
21            }
22        }
23        return map.isEmpty();
24    }
25}