public class Question5 {
    public static void main(String[] args){

        int[] nums1 = {5,3,4,2}, nums2 = {4,2,2,5};

        System.out.println(x(nums1, nums2));
    }

    static int x(int[] nums1, int[] nums2){

        int[] s1 = new int[101];
        int[] s2 = new int[101];

        for(int i=0; i<nums1.length; i++){
            s1[ nums1[i]]++;
            s2[ nums2[i]]++;
        }

        int sum = 0;
        int ind1 = 1;
        int ind2 = 100;

        while(ind1 < 101 && ind2 > 0){

            while (ind1 < 101 && s1[ind1] <= 0){
                ind1++;
            }
            while (ind2 > 0 && s2 [ind2] <= 0){
                ind2--;
            }
            if(ind1 >= 101){
                break;
            }

            s1[ind1]--;
            s2[ind2]--;

            sum += ind1*ind2;
        }
    return sum;
    }
}

//        **Question 5**
//
//        The **product sum** of two equal-length arrays a and b is equal to the
//        sum of a[i] * b[i] for all 0 <= i < a.length (**0-indexed**).
//
//        - For example, if a = [1,2,3,4] and b = [5,2,3,1], the **product sum**
//        would be 1*5 + 2*2 + 3*3 + 4*1 = 22.
//
//        Given two arrays nums1 and nums2 of length n, return *the **minimum product
//        sum** if you are allowed to **rearrange** the **order** of the elements in* nums1.
//
//        **Example 1:**
//
//        **Input:** nums1 = [5,3,4,2], nums2 = [4,2,2,5]
//
//        **Output:** 40
//
//        **Explanation:**
//
//        We can rearrange nums1 to become [3,5,4,2]. The product sum of [3,5,4,2]
//        and [4,2,2,5] is 3*4 + 5*2 + 4*2 + 2*5 = 40.