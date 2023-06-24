public class Question3 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        int target = 5;

        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
}
//        **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//        **Example 1:**
//        Input: nums = [1,3,5,6], target = 5
//
//        Output: 2