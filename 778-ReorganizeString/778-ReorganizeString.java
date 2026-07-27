// Last updated: 27/07/2026, 11:49:43
import java.util.*;

class Solution {
    public String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        String result = "";

        while(pq.size() > 1) {

            char first = pq.poll();
            char second = pq.poll();

            result += first;
            result += second;

            map.put(first, map.get(first) - 1);
            map.put(second, map.get(second) - 1);

            if(map.get(first) > 0)
                pq.add(first);

            if(map.get(second) > 0)
                pq.add(second);
        }

        if(!pq.isEmpty()) {
            char ch = pq.poll();

            if(map.get(ch) > 1)
                return "";

            result += ch;
        }

        return result;
    }
}