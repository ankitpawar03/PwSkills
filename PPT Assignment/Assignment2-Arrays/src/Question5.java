import java.util.Arrays;
public class Question5 {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        System.out.println(maxPro(nums));
    }
    static int maxPro(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
}

//Question 5 Given an integer array nums, find three numbers whose product is
// maximum and return the maximum product. Example 1: Input: nums = [1,2,3] Output: 6