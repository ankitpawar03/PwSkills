import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {

        String  word1 = "sea", word2 = "eat";

        int ans = distance(word1, word2);

        System.out.println(ans);
    }
     static int lcs(String s1,  String s2 ,int n ,int m ){
        if(m == 0 || n == 0) return  m + n;

        if(s1.charAt(m - 1) == s2.charAt(n - 1))
            return lcs(s1, s2, m - 1, n - 1);

        int deleteIns1 = lcs(s1, s2, m - 1, n);
        int deleteIns2 = lcs(s1, s2, m, n - 1);

        return Math.min(deleteIns1, deleteIns2) + 1;
    }
    static int distance(String word1, String word2) {

        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int[] row : dp) Arrays.fill(row, -1);

        for(int i = 0; i <= m; i++)
            dp[i][0] = i;

        for(int j = 0; j <= n; j++)
            dp[0][j] = j;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else{
                    int deleteInS = dp[i - 1][j];
                    int deleteInT = dp[i][j - 1];
                    dp[i][j] = Math.min(deleteInS, deleteInT) + 1;
                }
            }
        }
        return dp[m][n];
    }
}

//        **Question 3**
//
//        Given two strings word1 and word2, return *the minimum number of
//        **steps** required to make* word1 *and* word2 *the same*.
//
//        In one **step**, you can delete exactly one character in either string.
//
//        **Example 1:**
//
//        **Input:** word1 = "sea", word2 = "eat"
//
//        **Output:** 2
//
//        **Explanation:** You need one step to make "sea" to "ea" and another
//        step to make "eat" to "ea".