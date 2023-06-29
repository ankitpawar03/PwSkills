import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a = transpose(arr);
        System.out.print("[" + Arrays.toString(a[0]) + ",");
        System.out.print(Arrays.toString(a[1]) + ",");
        System.out.print(Arrays.toString(a[2]) + "]");
    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[row][col] = matrix[i][j];

                row++;

                if (row % ans.length == 0) {
                    row = 0;
                    col++;
                }
            }
        }
        return ans;
    }
}
//        Given a 2D integer array matrix, return *the **transpose** of* matrix.
//
//        The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//
//        **Example 1:**
//
//        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//
//        Output: [[1,4,7],[2,5,8],[3,6,9]]