public class Question1 {
    public static void main(String[] args) {

        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(sum(arr, target));
    }

    static int sum(int[] nums, int target) {
        int closest = Integer.MAX_VALUE, closeSum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int close1 = Math.abs(sum-target);
                    if(close1 < closest){
                        closest = close1;
                        closeSum = sum;
                    }
                }
            }
        }
        return closeSum;
    }
}
//        Question 1
//        Given an integer array nums of length n and an integer target, find three integers
//        in nums such that the sum is closest to the target.
//        Return the sum of the three integers.
//
//        You may assume that each input would have exactly one solution.
//
//        Example 1:
//        Input: nums = [-1,2,1,-4], target = 1
//        Output: 2
//
//        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).