// Last updated: 14/07/2026, 14:01:56
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                l1.add(Math.abs(arr[i]));
            }else{
                arr[index]=arr[index]*-1;
            }
        }
        return l1;
    }
}