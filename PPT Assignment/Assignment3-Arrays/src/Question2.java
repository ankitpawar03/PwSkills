import java.util.*;
public class Question2 {
    public static void main(String[] args) {

        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List ans = findSum(arr, target);
        System.out.println(ans);
    }
    static List<List<Integer>> findSum(int[] nums, int target) {

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int first;
        for(int j=0; j<nums.length-3; j++){
            int l;
            int r;
            for(int i=j+1; i<nums.length-2 ; i++){
                l = i+1;
                r = nums.length-1;
                while(l<r){

                    long sum = nums[j];
                    sum += nums[i];
                    sum += nums[l];
                    sum += nums[r];
                    if(sum==target){
                        set.add(Arrays.asList(nums[j],nums[i],nums[l],nums[r]));
                        l++;
                    }
                    else if(sum<target) l++;
                    else r--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
//    Given an array nums of n integers, return an array of all the unique quadruplets
//        [nums[a], nums[b], nums[c], nums[d]] such that:
//        ● 0 <= a, b, c, d < n
//           ● a, b, c, and d are distinct.
//                   ● nums[a] + nums[b] + nums[c] + nums[d] == target
//
//                   You may return the answer in any order.
//
//                   Example 1:
//                   Input: nums = [1,0,-1,0,-2,2], target = 0
//                   Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]