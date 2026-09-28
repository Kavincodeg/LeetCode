// Last updated: 28/09/2026, 12:12:02
1class Solution {
2    public int maxEqualFreq(int[] nums) {
3        int max=0;
4        for(int x:nums)
5            if(x>max)
6                max=x;
7        int[] map = new int[nums.length+1];
8        int[] a = new int[max+1];
9        max=1;
10        int maxFreq=0, minFreq=Integer.MAX_VALUE, count=0;
11        for(int i=0;i<nums.length;i++){
12            int freq =  ++a[nums[i]];
13            if(map[freq]++==0)
14                count++;
15            if(freq>1 && map[freq-1]--==1){
16                count--; 
17                if(freq-1==minFreq)
18                   minFreq++;
19            }
20            maxFreq = Math.max(maxFreq,freq);
21            minFreq = Math.min(minFreq,freq);
22            if(count==1 && (maxFreq==1 || map[maxFreq]==1))
23                max=Math.max(max,i+1);
24            if(count==2){
25                if(map[1]==1 || (map[maxFreq]==1 && maxFreq==minFreq+1))
26                   max=Math.max(max,i+1);
27            }
28        }
29        return max;
30    }
31}