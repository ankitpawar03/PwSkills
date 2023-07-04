import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {

        String s = "()";
        System.out.println(check(s));
    }
    static boolean check(String s){
        int n=s.length();

        int dp[][]=new int[n][n+3];
        for(int x[]:dp)
            Arrays.fill(x,-1);

        return helper(s,0,0,dp);
    }

    static boolean helper(String s,int i,int open,int dp[][]){
        if(i>=s.length())
            return open==0;

        if(open<0)
            return false;

        if(dp[i][open]!=-1)
            return dp[i][open]==1;

        int x=open;
        for(int k=i;k<s.length();k++){
            if(s.charAt(k)=='(')
                x++;

            else if(s.charAt(k)==')'){
                if(x==0){
                    dp[i][open]=2;
                    return false;
                }
                else
                    x--;
            }
            else {
                dp[i][open]=helper(s,k+1,x+1,dp)|| helper(s,k+1,x-1,dp)||helper(s,k+1,x,dp)?1:2;
                return dp[i][open]==1;
            }
        }
        dp[i][open]=x==0?1:2;
        return dp[i][open]==1;
    }
}

//        **Question 2**
//
//        Given a string s containing only three types of characters: '(', ')' and
//        '*', return true *if* s *is **valid***.
//
//        The following rules define a **valid** string:
//
//        - Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//        - Any right parenthesis ')' must have a corresponding left parenthesis '('.
//        - Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//        - '*' could be treated as a single right parenthesis ')' or a single left
//        parenthesis '(' or an empty string "".
//
//        **Example 1:**
//
//        **Input:** s = "()"
//
//        **Output:**
//
//        true