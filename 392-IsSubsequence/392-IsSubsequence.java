// Last updated: 14/07/2026, 14:01:59
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() == 0) return true;

        int k = 0;
        int l = s.length() - 1;
        int n = t.length();
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (k < s.length() && s.charAt(k) == t.charAt(i)) {
                k++;
                c++;
            }
                if (k == s.length()) {break;
            }
        }

        return c == s.length();
    }
}
