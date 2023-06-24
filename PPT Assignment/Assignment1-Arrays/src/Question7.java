import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        move0(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void move0(int[] arr){

        int i=0;

        for(int x : arr){
            if(x != 0){
                arr[i] = x;
                i++;
            }
        }
        while (i<arr.length){
            arr[i] = 0;
            i++;
        }
    }
}
//        **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//        **Example 1:**
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]