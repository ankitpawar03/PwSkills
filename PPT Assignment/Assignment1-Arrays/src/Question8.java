import java.util.Arrays;
public class Question8 {
    public static void main(String[] args) {

        int[] arr = {1,2,2,4};
        int[] ans = misMatch(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] misMatch(int[] arr){

        int[] ans = new int[2];
        int i = 0;

        while(i<arr.length){

            int correct = arr[i]-1;

            if(arr[i] != arr[correct]){
                swap(arr, correct, i);
            }else{
                i++;
            }
        }
        int j = 0;
        for(int index=0; index<arr.length; index++){

            if(arr[index] != index+1){
                ans[0] = arr[index];
                ans[1] = index+1;
            }
        }
        return ans;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

//        **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n.
//        Unfortunately, due to some error, one of the numbers in s got duplicated to another number
//        in the set, which results in repetition of one number and loss of another number.
//
//        You are given an integer array nums representing the data status of this set after the error.
//        Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//        **Example 1:**
//        Input: nums = [1,2,2,4]
//        Output: [2,3]
