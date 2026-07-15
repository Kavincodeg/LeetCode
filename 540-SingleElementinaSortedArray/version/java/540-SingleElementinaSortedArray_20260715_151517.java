// Last updated: 15/07/2026, 15:15:17
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        for(int key:map.keySet()){
8            if(map.get(key)==1){
9                return key;
10            }
11        }
12        return 0;
13    }
14}