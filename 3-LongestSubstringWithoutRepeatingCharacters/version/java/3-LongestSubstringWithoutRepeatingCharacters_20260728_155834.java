// Last updated: 28/07/2026, 15:58:34
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxLength = 0;
4        int left = 0;
5        Map<Character, Integer> count = new HashMap<>();
6        for (int right = 0; right < s.length(); right++) {
7            char c = s.charAt(right);
8            count.put(c, count.getOrDefault(c, 0) + 1);        
9            while (count.get(c) > 1) {
10                char leftChar = s.charAt(left);
11                count.put(leftChar, count.get(leftChar) - 1);
12                left++;
13            }           
14            maxLength = Math.max(maxLength, right - left + 1);
15        }      
16        return maxLength;       
17    }
18}