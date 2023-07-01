import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {
    public static void main(String[] args) {

        int[][] mat1 = {{1,0,0},{-1,0,3}}, mat2 = {{7,0,0},{0,0,0},{0,0,1}};

        int[][] ans = multiply(mat1, mat2);

        System.out.print("[");

        for(int i=0; i<ans.length; i++){
            System.out.print("[");
            for(int j=0; j<ans[i].length; j++){
                System.out.print(ans[i][j]);
                if(ans[i].length > j+1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(ans[i].length > i+2){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    static int[][] multiply(int[][] mat1, int[][] mat2) {
        int row1 = mat1.length, col1 = mat1[0].length, col2 = mat2[0].length;
        int[][] res = new int[row1][col2];
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col1; ++j) {
                if (mat1[i][j] != 0) {
                    mp.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                }
            }
        }
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col2; ++j) {
                if (mp.containsKey(i)) {
                    for (int k : mp.get(i)) {
                        res[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        return res;
    }
}

//        **Question 8**
//
//        Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix)
//        mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2.
//        You may assume that multiplication is always possible.
