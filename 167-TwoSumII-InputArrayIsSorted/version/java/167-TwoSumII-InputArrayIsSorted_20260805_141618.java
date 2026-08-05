// Last updated: 05/08/2026, 14:16:18
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int[] res=new int[2];
4        for(int i=0;i<numbers.length;i++){
5            int sum=numbers[i];
6            for(int j=i+1;j<numbers.length;j++){
7                if(sum+numbers[j]==target){
8                    res[0]=i+1;
9                    res[1]=j+1;
10                    return res;
11                }
12            }
13        }
14        return res;        
15    }
16}