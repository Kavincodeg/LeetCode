// Last updated: 17/08/2026, 11:35:09
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        for(int i=0;i<numbers.length;i++){
            int sum=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if(sum+numbers[j]==target){
                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
                }
            }
        }
        return res;        
    }
}