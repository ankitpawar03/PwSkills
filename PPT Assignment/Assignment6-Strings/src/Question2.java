public class Question2 {
    public static void main(String[] args){

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target = 3;

        boolean ans = searchMatrix(matrix, target);

        System.out.println(ans);
    }
        static boolean searchMatrix(int[][] matrix, int target) {

            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }

            int rowIndex = 0;
            int columnIndex = matrix[0].length - 1;
            while (columnIndex >= 0 && rowIndex <= matrix.length - 1) {
                int currentValue = matrix[rowIndex][columnIndex];
                if (currentValue == target) {
                    return true;
                }
                if (currentValue < target) {
                    rowIndex++;
                } else {
                    columnIndex--;
                }
            }
            return false;
        }
    }

//        **Question 2**
//
//        You are given an m x n integer matrix matrix with the following two properties:
//
//        - Each row is sorted in non-decreasing order.
//        - The first integer of each row is greater than the last integer of the previous row.
//
//        Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.
//
//        You must write a solution in O(log(m * n)) time complexity.