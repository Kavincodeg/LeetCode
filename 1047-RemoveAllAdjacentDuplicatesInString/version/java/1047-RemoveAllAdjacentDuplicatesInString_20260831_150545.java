// Last updated: 31/08/2026, 15:05:45
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> map=new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(map.isEmpty()){
6                map.push(ch);
7            }
8            else if(!map.isEmpty() && map.peek()!=ch){
9                map.push(ch);
10            }else if(!map.isEmpty() && map.peek()==ch){
11                map.pop();
12            }
13        }
14        String res="";
15        while(!map.isEmpty()) {
16            res += map.pop();
17        }
18        return new StringBuilder(res).reverse().toString();
19    }
20    
21}