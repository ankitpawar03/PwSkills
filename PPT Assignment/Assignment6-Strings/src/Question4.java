public class Question4 {
    public static void main(String[] args){

        int[] arr = {0,1};

        int ans = subArray(arr);

        System.out.println(ans);
    }
    static int subArray(int[] nums) {

        int N = nums.length;
        int[] mp = new int[2*N+2];
        int current = N;
        int result = 0;

        for(int i = 0; i < N; i++) {
            current += (nums[i] << 1) - 1;
            if(current == N) {
                result = i+1;
            }
            else if(mp[current] == 0) {
                mp[current] = i+1;
            }
            else {
                result = Math.max(result, i - mp[current]+1);
            }
        }
        return result;
    }
}

//        **Question 4**
//
//        Given a binary array nums, return *the maximum length of a contiguous
//        subarray with an equal number of* 0 *and* 1.
//
//        **Example 1:**
//
//        **Input:** nums = [0,1]
//
//        **Output:** 2
//
//        **Explanation:**
//
//        [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
