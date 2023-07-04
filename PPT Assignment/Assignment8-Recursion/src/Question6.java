import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {

        String s = "cbaebabacd", p = "abc";

        List ans = find(s, p);

        System.out.println(ans);
    }
    static List<Integer> find(String s1, String s2) {
        int s = s1.length(), p = s2.length();
        if(s < p)
            return new ArrayList<>();

        List<Integer> li = new ArrayList<>();
        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for(int i=0; i<p; i++) {
            c2[s2.charAt(i) - 'a']++;
            c1[s1.charAt(i) - 'a']++;
        }
        if(areEqual(c1, c2))
            li.add(0);

        for(int i=p; i<s; i++) {
            c1[s1.charAt(i-p) - 'a']--;
            c1[s1.charAt(i) - 'a']++;
            if(areEqual(c1, c2))
                li.add(i-p+1);
        }
        return li;
    }
    static boolean areEqual(int[] a, int[] b) {
        for(int i=0; i<26; i++)
            if(a[i] != b[i])
                return false;
        return true;
    }
}

//        **Question 6**
//
//        Given two strings s and p, return *an array of all the start indices
//        of* p*'s anagrams in* s. You may return the answer in **any order**.
//
//        An **Anagram** is a word or phrase formed by rearranging the letters
//        of a different word or phrase, typically using all the original letters exactly once.
//
//        **Example 1:**
//
//        **Input:** s = "cbaebabacd", p = "abc"
//
//        **Output:** [0,6]
//
//        **Explanation:**
//
//        The substring with start index = 0 is "cba", which is an anagram of "abc".
//
//        The substring with start index = 6 is "bac", which is an anagram of "abc".