// Last updated: 30/07/2026, 11:34:44
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        String res="";
4        int i=0;
5        int j=0;
6        while(i<a||j<b){
7            int n=res.length();
8            if(n>=2 && res.charAt(n-1)=='a' && res.charAt(n-2)=='a' && j<b){
9                res+='b';
10                j++;
11            }
12            else if(n>=2 && res.charAt(n-1)=='b' && res.charAt(n-2)=='b' && i<a){
13                res+='a';
14                i++;
15            } 
16            else if(i<a && j<b){
17                if((a-i) >= (b-j)){
18                    res += 'a';
19                    i++;
20                }else{
21                    res += 'b';
22                    j++;
23                }
24            }else if(i<a && j>=b){
25                res+='a';
26                i++;
27            }else if(i>=a && j<b){
28                res+='b';
29                j++;
30            }
31        }
32        return res;
33    }
34}