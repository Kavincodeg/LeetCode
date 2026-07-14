// Last updated: 14/07/2026, 14:03:18
class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int cur = value(s.charAt(i));
            int next = value(s.charAt(i + 1));
            if (cur < next) res -= cur;
            else res += cur;
        }
        return res + value(s.charAt(s.length() - 1));
    }

    private int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
