public class Question2 {
    public static void main(String[] args) {

        String s = "leetcode";
        int ans = check(s);
        System.out.println(ans);
    }
    static int check(String s) {
        int min = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int inx = s.indexOf(c);
            if (inx != -1 && inx == s.lastIndexOf(c)) min = Math.min(min, inx);
        }
        return (min != Integer.MAX_VALUE) ? min : -1;
    }
}

//    First Unique Character in a String
//
//    Given a string s, find the first non-repeating character in it and return
//    its index. If it does not exist, return -1.
//
//        Example 1:
//        Input: s = "leetcode"
//        Output: 0
//
//        Example 2:
//        Input: s = "loveleetcode"
//        Output: 2
//
//        Example 3:
//        Input: s = "aabb"
//        Output: -1
//
//        Constraints:
//        a. 1 <= s.length <= 10^5
//        b. s consists of only lowercase English letters.
//
//        Note: Create a GitHub file for the solution and add the file link the the answer section below.
//        5 points
