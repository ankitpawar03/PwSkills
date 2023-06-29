public class Question7 {
    public static void main(String[] args){

        int m = 3;
        int n = 3;
        int[][] ops = {{2,2},{3,3}};

        int ans = maxCount(m, n, ops);
        System.out.println(ans);
    }
    static int maxCount(int m, int n, int[][] o) {

        int k=o.length;

        for (int i=0;i<k;i++)
        {
            int z=o[i][0] ,x=o[i][1];
            n=Math.min(n,x);
            m=Math.min(m,z);
        }
        return (m*n);
    }
}

//        You are given an m x n matrix M initialized with all 0's and an array
//        of operations ops, where ops[i] = [ai, bi] means M[x][y] should be
//        incremented by one for all 0 <= x < ai and 0 <= y < bi.
//
//        Count and return *the number of maximum integers in the matrix after
//        performing all the operations*
//
//        **Example 1:**
//
//        ![q4.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4d0890d0-7bc7-4f59-be8e-352d9f3c1c52/q4.jpg)
//
//        **Input:** m = 3, n = 3, ops = [[2,2],[3,3]]
//
//        **Output:** 4
//
//        **Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4
