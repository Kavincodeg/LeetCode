// Last updated: 14/07/2026, 14:02:09
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String v="AEIOUaeiou";
        int n=s.length();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (v.indexOf(arr[i]) != -1 && v.indexOf(arr[j]) != -1) {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else {
                if (v.indexOf(arr[i]) == -1) i++;
                if (v.indexOf(arr[j]) == -1) j--;
            }
        }
        
        return new String(arr);
    }
}