import java.util.Arrays;

public class Question4 {

    public static void main(String[] args){

        int[] arr = {1,4,3,2};
        int ans = sum(arr);
        System.out.println(ans);
    }
    static int sum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, i = 0;
        while(i<nums.length){
            sum += nums[i];
            i+=2;
        }
        return sum;
    }
}

//        **Question 4**
//        Given an integer array nums of 2n integers, group these integers into
//        n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi)
//        for all i is **maximized**. Return *the maximized sum*.
//
//        **Example 1:**
//
//        Input: nums = [1,4,3,2]
//
//        Output: 4
//
//        **Explanation:** All possible pairings (ignoring the ordering of elements) are:
//
//        1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
//
//        2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
//
//        3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
//
//        So the maximum possible sum is 4.