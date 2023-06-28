import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {

        int [] arr = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;

        List ans = find(arr, lower, upper);

        System.out.println(ans);
    }
    static List<String> find(int[] nums, int lower, int upper){

        ArrayList<String> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++){

            if(lower < nums[i]){
                if(nums[i] - lower == 1){
                    res.add(lower + "");
                }
                else {
                    res.add(lower + "->" + (nums[i]-1));
                }
            }
            if(nums[i] == Integer.MAX_VALUE){
                return res;
            }
            lower = nums[i] + 1;

        }
        if(lower < upper){
            res.add(lower + "->"+ upper);
        }
        else if ( lower == upper){
            res.add(lower+ "");
        }
        return res;
    }
}

//        Question 7
//        You are given an inclusive range [lower, upper] and a sorted unique integer array
//        nums, where all elements are within the inclusive range.
//
//        A number x is considered missing if x is in the range [lower, upper] and x is not in
//        nums.
//
//        Return the shortest sorted list of ranges that exactly covers all the missing
//        numbers. That is, no element of nums is included in any of the ranges, and each
//        missing number is covered by one of the ranges.
//
//        Example 1:
//        Input: nums = [0,1,3,50,75], lower = 0, upper = 99
//        Output: [[2,2],[4,49],[51,74],[76,99]]
//
//        Explanation: The ranges are:
//        [2,2]
//        [4,49]
//        [51,74]
//        [76,99]