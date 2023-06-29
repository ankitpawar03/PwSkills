import java.util.Arrays;
public class Question6 {
    public static void main(String[] args){

        int[] arr = {-4,-1,0,3,10};
        int[] ans = square(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] square(int[] nums) {

        for(int i=0; i<nums.length; i++){

            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

//        Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.
//
//        **Example 1:**
//
//        Input: nums = [-4,-1,0,3,10]
//
//        Output: [0,1,9,16,100]
//
//        **Explanation:** After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100]