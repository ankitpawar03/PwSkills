public class Question5 {
    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};

        int ans = compress(chars);

        System.out.println(ans);
    }
    static StringBuilder s=new StringBuilder("");
    static int compress(char[] chars) {
        s.setLength(0);
        s.append(chars[0]);
        helper(chars,1,1);
        for(int i=0;i<s.length();i++)
            chars[i]=s.charAt(i);
        return s.length();
    }
     static void helper(char[] chars,int count,int i){
        if(i>=chars.length){
            if(count!=1)
                s.append(count);
            return;
        }

        else if(s.charAt(s.length()-1)==chars[i]){
            count++;
        }
        else {
            if(count!=1){
                s.append(count);
                count=1;
            }
            s.append(chars[i]);
        }
        helper(chars,count,i+1);
    }
}

//        **Question 5**
//
//        Given an array of characters chars, compress it using the following
//        algorithm:
//
//        Begin with an empty string s. For each group of **consecutive
//        repeating characters** in chars:
//
//        - If the group's length is 1, append the character to s.
//        - Otherwise, append the character followed by the group's length.
//
//        The compressed string s **should not be returned separately**,
//        but instead, be stored **in the input character array chars**.
//        Note that group lengths that are 10 or longer will be split into
//        multiple characters in chars.
//
//        After you are done **modifying the input array,** return *the
//        new length of the array*.
//
//        You must write an algorithm that uses only constant extra space.
//
//        **Example 1:**
//
//        **Input:** chars = ["a","a","b","b","c","c","c"]
//
//        **Output:** Return 6, and the first 6 characters of the input
//        array should be: ["a","2","b","2","c","3"]
//
//        **Explanation:**
//
//        The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".