public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        if (A == null ||A.length == 0) {
            return new int[0];
        }
        int totalElements = A.length * A[0].length;
        int[] result = new int[totalElements];

        int index = 0;
        int top = 0, bottom = A.length - 1;
        int left = 0, right = A[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result[index++] = A[top][i];
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[index++] = A[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = A[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = A[i][left];
                }
                left++;
            }
        }

        return result;
    }
    
}
