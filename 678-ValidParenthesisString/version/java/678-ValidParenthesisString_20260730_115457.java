// Last updated: 30/07/2026, 11:54:57
1class Solution {
2    public boolean checkValidString(String s) {
3        int min=0;
4        int max=0;
5        for(char ch:s.toCharArray()){
6            if(ch=='('){
7                min++;
8                max++;
9            }else if(ch==')'){
10                min--;
11                max--;
12            }else if(ch=='*'){
13                min--;
14                max++;
15            }
16            min=Math.max(min,0);
17            if(max<0){
18                return false;
19            }
20        }
21        return min==0;
22    }
23}