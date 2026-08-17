// Last updated: 17/08/2026, 11:33:42
import java.util.*;
class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> seq = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.get(num) == 0)
                continue;
            if(seq.getOrDefault(num, 0) > 0) {
                seq.put(num, seq.get(num) - 1);
                seq.put(num + 1,seq.getOrDefault(num + 1, 0) + 1);
                map.put(num, map.get(num) - 1);
            }
            else if(map.getOrDefault(num + 1, 0) > 0 && map.getOrDefault(num + 2, 0) > 0) {
                map.put(num, map.get(num) - 1);
                map.put(num + 1, map.get(num + 1) - 1);
                map.put(num + 2, map.get(num + 2) - 1);
                seq.put(num + 3, seq.getOrDefault(num + 3, 0) + 1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}