import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args){

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        List ans = search(nums1, nums2);
        System.out.println(ans);
    }
    static List<List<Integer>> search(int[] nums1, int[] nums2) {
        List<List<Integer>> list= new ArrayList<>();

        list.add(finder(nums1, nums2) );
        list.add(finder(nums2, nums1) );

        return list;
    }
        static  List<Integer> finder(int[] nums1, int[] nums2){

            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                int f=0;
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i] == nums2[j]){
                        f=1;
                        break;
                    }
                }
                if(f==0){
                    if(!arr.contains(nums1[i])){
                        arr.add(nums1[i]);
                    }
                }
            }
            return arr;
        }
    }
//        **Question 2**
//
//        Given two **0-indexed** integer arrays nums1 and nums2,
//        return *a list* answer *of size* 2 *where:*
//
//        - answer[0] *is a list of all **distinct** integers
//        in* nums1 *which are **not** present in* nums2*.*
//        - answer[1] *is a list of all **distinct** integers
//        in* nums2 *which are **not** present in* nums1.
//
//        **Note** that the integers in the lists may be returned
//        in **any** order.
//
//        **Example 1:**
//
//        **Input:** nums1 = [1,2,3], nums2 = [2,4,6]
//
//        **Output:** [[1,3],[4,6]]
//
//        **Explanation:**
//
//        For nums1, nums1[1] = 2 is present at index 0 of nums2,
//        whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2.
//        Therefore, answer[0] = [1,3].
//
//        For nums2, nums2[0] = 2 is present at index 1 of nums1,
//        whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2.
//        Therefore, answer[1] = [4,6].