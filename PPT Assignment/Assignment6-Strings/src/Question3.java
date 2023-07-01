public class Question3 {
    public static void main(String[] args){

        int[] arr = {2,1};

        System.out.println(mountainArray(arr));
    }
    static boolean mountainArray(int[] arr) {

        if(arr.length<3) return false;

        int topidx=0;
        int top=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>top){
                top = arr[i];
                topidx=i;
            }
        }

        if(top==arr[arr.length-1] || top==arr[0]) return false;

        int i=0;
        while(i<topidx){
            if(arr[i] >= arr[i+1]) return false;
            i++;
        }

        while(topidx<arr.length-1){
            if(arr[topidx] <= arr[topidx+1]) return false;
            topidx++;
        }
        return true;
    }
}

//💡 **Question 3**
//
//        Given an array of integers arr, return *true if and only if it is a valid mountain array*.
//
//        Recall that arr is a mountain array if and only if:
//
//        - arr.length >= 3
//        - There exists some i with 0 < i < arr.length - 1 such that:
//        - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//        - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]