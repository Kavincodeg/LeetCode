// Last updated: 16/07/2026, 16:29:40
1class Solution {
2    private int[] original;
3    private Random rand = new Random();
4
5    public Solution(int[] nums) {
6        original = nums.clone();
7    }
8
9    public int[] reset() {
10        return original.clone();
11    }
12
13    public int[] shuffle() {
14        int[] arr = original.clone();
15        int n = arr.length;
16        for(int i = 0; i < n; i++){
17            int x = rand.nextInt(n);
18            for(int j = 0; j < n; j++){
19                if(i == j){
20                    int temp = arr[x];
21                    arr[x] = arr[j];
22                    arr[j] = temp;
23                }
24            }
25        }
26        return arr;
27    }
28}