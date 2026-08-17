// Last updated: 17/08/2026, 11:34:53
class Solution {
    public int calculate(String s) {
        int sum = 0;
        int num = 0;
        int last = 0;
        char sign = '+';
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
            if((ch < '0' || ch > '9') && ch != ' ' || i == s.length() - 1) {
                if(sign == '+') {
                    sum += last;
                    last = num;
                }
                else if(sign == '-') {
                    sum += last;
                    last = -num;
                }
                else if(sign == '*') {
                    last = last * num;
                }
                else if(sign == '/') {
                    last = last / num;
                }
                sign = ch;
                num = 0;
            }
        }
        sum += last;
        return sum;
    }
}