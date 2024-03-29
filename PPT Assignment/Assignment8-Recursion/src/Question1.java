public class Question1 {
    public static void main(String[] args) {

        String s1 = "sea", s2 = "eat";

        int ans = deleteSum(s1, s2);

        System.out.println(ans);
    }
    static int deleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 2][s2.length() +   2];
        int max = 0, inc;
        int ts1 = s1.chars().reduce(0, Integer::sum);
        int ts2 = s2.chars().reduce(0, Integer::sum);
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                inc = s1.charAt(i - 1) == s2.charAt(j - 1) ? (int) s1.charAt(i - 1) : 0;
                dp[i][j] = Math.max(dp[i - 1][j - 1] + inc, Math.max(dp[i][j - 1], dp[i - 1][j]));
                max = Math.max(max, dp[i][j]);
            }
        }
        return ts1 + ts2 - 2 * max;
    }
}
//        **Question 1**
//
//        Given two strings s1 and s2, return *the lowest **ASCII** sum of
//        deleted characters to make two strings equal*.
//
//        **Example 1:**
//
//        **Input:** s1 = "sea", s2 = "eat"
//
//        **Output:** 231
//
//        **Explanation:** Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
//
//        Deleting "t" from "eat" adds 116 to the sum.
//
//        At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.