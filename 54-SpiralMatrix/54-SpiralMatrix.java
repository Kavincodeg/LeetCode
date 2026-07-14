// Last updated: 14/07/2026, 14:03:02
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l1 = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, bot = row - 1, left = 0, right = col - 1;
        int total = row * col;
        int count = 0;

        while (count < total) {
            for (int j = left; j <= right && count < total; j++) {
                l1.add(matrix[top][j]);
                count++;
            }
            top++;

            for (int i = top; i <= bot && count < total; i++) {
                l1.add(matrix[i][right]);
                count++;
            }
            right--;

            for (int j = right; j >= left && count < total; j--) {
                l1.add(matrix[bot][j]);
                count++;
            }
            bot--;

            for (int i = bot; i >= top && count < total; i--) {
                l1.add(matrix[i][left]);
                count++;
            }
            left++;
        }

        return l1;
    }
}