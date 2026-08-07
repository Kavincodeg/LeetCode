// Last updated: 07/08/2026, 11:47:09
1class Solution {
2    public boolean isValidSerialization(String preorder) {
3        String[] arr = preorder.split(",");
4        int slots = 1;
5        for (String s : arr) {
6            slots--;
7            if (slots < 0)
8                return false;
9            if (!s.equals("#"))
10                slots += 2;
11        }
12        return slots == 0;
13    }
14}