public class Question7 {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3};
        System.out.println(check(arr));
    }
    static boolean check(int[] nums) {
        int count = 0 ;

        for(int i = 0 ; i < nums.length -1 ; i++){
            if(nums[i]<=nums[i+1]){
                continue ;
            }else{
                count ++;
                break ;
            }
        }
        for(int i = 0 ; i < nums.length -1 ; i++){
            if(nums[i]>=nums[i+1]){
                continue;
            }else{
                count ++;
                break ;
            }
        }
        if(count == 2){
            return false;
        }else{
            return true;
        }
    }
}
//        Question 7
//        An array is monotonic if it is either monotone increasing or monotone decreasing.
//
//        An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
//        monotone decreasing if for all i <= j, nums[i] >= nums[j].
//
//        Given an integer array nums, return true if the given array is monotonic, or false otherwise.
//
//        Example 1:
//        Input: nums = [1,2,2,3]
//        Output: true