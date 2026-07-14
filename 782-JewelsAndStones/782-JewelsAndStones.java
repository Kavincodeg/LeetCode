// Last updated: 14/07/2026, 14:01:48
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
        for(char num:jewels.toCharArray()){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(char num:stones.toCharArray()){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        int c=0;
        for(char key:map1.keySet()){
            if(map2.containsKey(key)){
                c+=map2.get(key);
            }
        }
        return c;
    }
}