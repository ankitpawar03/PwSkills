public class Question4 {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

        System.out.println(reverse(s));
    }
    static String reverse(String s) {

        int l=0;
        int r=0;
        char a[]=s.toCharArray();

        while(l<s.length()){
            while(r<s.length() && a[r]!=' '){
                r++;
            }
            reverse(a,l,r-1);
            l=r+1;
            r=l;
        }
        return String.valueOf(a);
    }
    static String reverse(char s[],int l,int r){
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        return String.valueOf(s);
    }
}

//        **Question 4**
//
//        Given a string s, reverse the order of characters in each word
//        within a sentence while still preserving whitespace and initial
//        word order.
//
//        **Example 1:**
//
//        **Input:** s = "Let's take LeetCode contest"
//
//        **Output:** "s'teL ekat edoCteeL tsetnoc"
