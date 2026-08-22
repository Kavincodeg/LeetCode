// Last updated: 22/08/2026, 14:46:42
1class Solution {
2    public boolean checkDivisibility(int n) {
3         int org=n;
4         int s=0;
5         int p=1;
6         while(n>0){
7            int temp=n%10;
8            s+=temp;
9            p*=temp;
10            n=n/10;
11         }
12         s+=p;
13         if(org%s==0){
14            return true;
15         }else{
16            return false;
17         }   
18    }
19}