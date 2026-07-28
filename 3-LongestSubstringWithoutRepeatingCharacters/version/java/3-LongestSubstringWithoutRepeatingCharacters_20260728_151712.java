// Last updated: 28/07/2026, 15:17:12
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxLength = 0;
4        int left = 0;
5        Map<Character, Integer> count = new HashMap<>();
6
7        for (int right = 0; right < s.length(); right++) {
8            char c = s.charAt(right);
9            count.put(c, count.getOrDefault(c, 0) + 1);
10            
11            while (count.get(c) > 1) {
12                char leftChar = s.charAt(left);
13                count.put(leftChar, count.get(leftChar) - 1);
14                left++;
15            }
16            
17            maxLength = Math.max(maxLength, right - left + 1);
18        }
19        
20        return maxLength;       
21    }
22}