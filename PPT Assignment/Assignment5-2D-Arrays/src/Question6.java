import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,3,1};

        List ans = duplicates(arr);

        System.out.println(ans);
    }

    static List<Integer> duplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int i = 0;

        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, correct, i);
            }
            else{
                i++;
            }
        }
        for( i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


//        **Question 6**
//
//        Given an integer array nums of length n where all the integers of nums
//        are in the range [1, n] and each integer appears **once** or **twice**,
//        return *an array of all the integers that appears **twice***.
//
//        You must write an algorithm that runs in O(n) time and uses only constant extra space.
//
//        **Example 1:**
//
//        **Input:** nums = [4,3,2,7,8,2,3,1]
//
//        **Output:**
//
//        [2,3]