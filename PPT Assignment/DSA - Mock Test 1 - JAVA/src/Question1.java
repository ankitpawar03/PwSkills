import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void move(int[] arr){

        int i = 0;
        for (int x : arr){
            if(x != 0){
                arr[i] = x;
                i++;
            }
        }
        while(i<arr.length){
            arr[i] = 0;
            i++;
        }
    }
}
//        Move Zeroes
//        Given an integer array nums, move all 0's to the end of it while maintaining
//        the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//        Example 1:
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//
//        Example 2:
//        Input: nums = [0]
//        Output: [0]
//
//        Constraints:
//        a. 1 <= nums.length <= 10^4
//        b. -2^31 <= nums[i] <= 2^31 - 1