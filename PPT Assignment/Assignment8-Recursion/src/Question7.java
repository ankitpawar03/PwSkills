public class Question7 {
    public static void main(String[] args) {

        String s = "3[a]2[bc]";

        System.out.println(decodeString(s));
    }
    static String decodeString(String s) {

        return decodeString(
                String.format("1[%s]", s).toCharArray(),
                0
        ).toString();
    }
    static StringBuilder decodeString(char[] s, int left) {

        StringBuilder sb = new StringBuilder();
        int repeat = 0;
        for (int i = left; i < s.length; i++) {
            if (s[i] == '*') {
                continue;
            } else if (s[i] >= '0' && s[i] <= '9') {
                repeat = repeat * 10 + (int)(s[i] - '0');
                s[i] = '*';
            } else if (s[i] == '[') {
                StringBuilder sbRes = decodeString(s, i + 1);
                while (repeat > 0) {
                    sb.append(sbRes);
                    repeat--;
                }
                s[i] = '*';
            } else if (s[i] == ']') {
                s[i] = '*';
                return sb;
            } else if (s[i] >= 'a' && s[i] <= 'z') {
                sb.append(s[i]);
                s[i] = '*';
            }
        }
        return sb;
    }
}

//        **Question 7**
//
//        Given an encoded string, return its decoded string.
//
//        The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//
//        You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
//
//        The test cases are generated so that the length of the output will never exceed 105.
//
//        **Example 1:**
//
//        **Input:** s = "3[a]2[bc]"
//
//        **Output:** "aaabcbc"