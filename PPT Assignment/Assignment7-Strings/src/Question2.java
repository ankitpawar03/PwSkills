import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {

        String num = "69";
        System.out.println(check(num));
    }
    static Map<Character, Character> map = new HashMap<Character, Character>(){
        {
            put('0', '0');
            put('1', '1');
            put('6', '9');
            put('8', '8');
            put('9', '6');
        }
    };
    static boolean check(String num) {
        for (int i=0, j=num.length()-1; i <= j; i++, j--)
            if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
                return false;
        return true;
    }
}

//        **Question 2**
//
//        Given a string num which represents an integer, return true *if* num *is a **strobogrammatic number***.
//
//        A **strobogrammatic number** is a number that looks the same when rotated 180 degrees (looked at upside down).
//
//        **Example 1:**
//
//        **Input:** num = "69"
//
//        **Output:**
//
//        true