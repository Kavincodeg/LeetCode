// Last updated: 14/07/2026, 14:01:57
class Solution {
    public int countSegments(String s) {
        if(s.equals("")){
            return 0;
        }
        else{
        int c=0;
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("")){
                continue;
            }else{
                c++;
            }
        }
        return c;}
    }
}