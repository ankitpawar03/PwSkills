import java.util.Arrays;

public class Question7 {

    public static void main(String[] args) {

        int n = 3;

        int[][] ans = matrix(n);

        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print("[");
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
                if (j < ans[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < ans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    static int[][] matrix(int n) {
        int [][] a = new int[n][n];
        int l=0,t=0,b=n-1,r=n-1,v=1;
        while(t<=b||l<=r){
            if(t<=b){
                for(int i=l;i<=r;i++)
                    a[t][i]=v++;
                t++;
            }
            if(l<=r){
                for(int i=t;i<=b;i++)
                    a[i][r]=v++;
                r--;
            }
            if(t<=b){
                for(int i=r;i>=l;i--)
                    a[b][i]=v++;
                b--;
            }
            if(t<=b){
                for(int i=b;i>=t;i--)
                    a[i][l]=v++;
            }
            l++;
        }
        return a;
    }
}
//    Given a positive integer n, generate an n x n matrix
//    filled with elements from 1 to n2 in spiral order.
//
//    **Example 1:**