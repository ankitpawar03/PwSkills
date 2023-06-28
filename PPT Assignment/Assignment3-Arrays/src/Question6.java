public class Question6 {
    public static void main(String[] args) {

        int[] arr = {2,2,1};
        int ans = singleNumber(arr);

        System.out.println(ans);
    }
    static int singleNumber(int[] nums) {

        int ans = 0;

        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}

//        Question 6
//        Given a non-empty array of integers nums, every element appears twice except
//        for one. Find that single one.
//
//        You must implement a solution with a linear runtime complexity and use only
//        constant extra space.
//
//        Example 1:
//        Input: nums = [2,2,1]
//        Output: 1