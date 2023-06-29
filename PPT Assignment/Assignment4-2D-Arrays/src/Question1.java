import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
        List ans = common(arr1,arr2,arr3);

        System.out.println(ans);
    }
    static List common(int[] a1, int[] a2, int[] a3){

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<a1.length; i++){

            int temp = 0;

            for(int x : a2){
                if(a1[i] == x){
                    temp = a1[i];
                    break;
                }
            }
            for(int x : a3){
                if(temp == x){
                    ans.add(temp);
                    break;
                }
            }
        }
        return ans;
    }
}

//💡      **Question 1**
//        Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.
//
//        **Example 1:**
//
//        Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
//
//        Output: [1,5]
//
//        **Explanation:** Only 1 and 5 appeared in the three arrays
//