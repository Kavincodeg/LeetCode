// Last updated: 17/08/2026, 11:33:11
class Solution {
    public String strWithout3a3b(int a, int b) {
        String res="";
        int i=0;
        int j=0;
        while(i<a||j<b){
            int n=res.length();
            if(n>=2 && res.charAt(n-1)=='a' && res.charAt(n-2)=='a' && j<b){
                res+='b';
                j++;
            }
            else if(n>=2 && res.charAt(n-1)=='b' && res.charAt(n-2)=='b' && i<a){
                res+='a';
                i++;
            } 
            else if(i<a && j<b){
                if((a-i) >= (b-j)){
                    res += 'a';
                    i++;
                }else{
                    res += 'b';
                    j++;
                }
            }else if(i<a && j>=b){
                res+='a';
                i++;
            }else if(i>=a && j<b){
                res+='b';
                j++;
            }
        }
        return res;
    }
}