public class Question8 {
    public static void main(String[] args) {

        String s = "ab", goal = "ba";

        boolean ans = buddyStrings(s, goal);

        System.out.println(ans);
    }
    static boolean buddyStrings(String s, String g) {
        if(s.length()!=g.length() || s.length()<2) return false;
        int n = s.length();
        if(s.equals(g)){
            int[] count = new int[26];
            for(int i=0;i<n;i++){
                count[s.charAt(i)-'a']+=1;
                if(count[s.charAt(i)-'a']>=2) return true;
            }
            return false;
        }
        int diff = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=g.charAt(i)){
                diff+=1;
                if(diff==1) firstIndex=i;
                else if(diff==2) secondIndex=i;
            }
            if(diff>2) return false;
        }
        return (s.charAt(firstIndex)==g.charAt(secondIndex) &&
                g.charAt(firstIndex)==s.charAt(secondIndex));
    }
}

//        **Question 8**
//
//        Given two strings s and goal, return true *if you can swap two
//        letters in* s *so the result is equal to* goal*, otherwise, return* false*.*
//
//        Swapping letters is defined as taking two indices i and j
//        (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
//
//        - For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
//
//        **Example 1:**
//
//        **Input:** s = "ab", goal = "ba"
//
//        **Output:** true
//
//        **Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
