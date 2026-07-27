// Last updated: 27/07/2026, 11:49:41
import java.util.*;

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        String res = "";
        for(char ch : order.toCharArray()) {
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                for(int i = 0; i < count; i++) {
                    res += ch;
                }
                map.remove(ch);
            }
        }
        for(char ch : s.toCharArray()) {
            if(map.containsKey(ch)) {
                res += ch;
            }
        }
        return res;
    }
}