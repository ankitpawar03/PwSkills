import java.util.HashSet;

public class Question6 {

    public static void main(String[] args) {


//💡      **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//        **Example 1:**
//        Input: nums = [1,2,3,1]
//
//        Output: true

        int[] arr = {1,2,3,1};
        System.out.println(duplicate(arr));
    }
    static boolean duplicate(int[] arr){

        if(arr==null || arr.length==0)
            return false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: arr)
        {
            if(!set.add(i))
            {
                return true;
            }
        }
        return false;
    }
}
