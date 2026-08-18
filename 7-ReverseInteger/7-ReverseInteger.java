// Last updated: 18/08/2026, 14:47:07
class Solution {
    public int reverse(int x) {
        int res = 0;
        int c = 0;
        if(x < 0) {
            x = 0 - x;
            c = 1;
        }
        while(x > 0) {
            int temp = x % 10;
            if(res > Integer.MAX_VALUE / 10 ||
               (res == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            res = res * 10 + temp;
            x = x / 10;
        }
        if(c == 1) {
            return -res;
        }
        else {
            return res;
        }
    }
}