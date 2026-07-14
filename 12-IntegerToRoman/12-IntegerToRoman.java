// Last updated: 14/07/2026, 14:03:16
class Solution {
    public String intToRoman(int num) {
        int[] vals =    {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,  4, 1};
        String[] syms = {"M",  "CM","D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV","I"};
        String res = "";
        for (int i = 0; i < vals.length && num > 0; i++) {
            while (num >= vals[i]) {
                num -= vals[i];
                res += syms[i];
            }
        }
        return res;
    }
}