package Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 4;
        leftRotateByD(arr,d);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
//                    Brute Force
//    public static void leftRotateByD(int [] arr, int d){
//        int n = arr.length;
//        for (int i = 0; i < d; i++) {
//            int first = arr[0];
//
//            // Shift all elements one position to the left
//            for (int j = 0; j < n-1; j++) {
//                arr[j] = arr[j+1];
//            }
//            // Place the first element at the end
//            arr[n-1] = first;
//        }
//    }


                    // Better Approach
//    public static void leftRotateByD(int [] arr, int d){
//        int n = arr.length;
//        int [] temp = new int [d];
//        for (int i = 0; i < d; i++) {
//            temp[i] = arr[i];
//        }
//        for (int i = d; i < n; i++) {
//            arr[i - d] = arr[i];
//        }
//        for (int i = 0; i < d; i++) {
//            arr[n - d + i] = temp[i];
//        }
//    }

                        // Optimal Approach
    public static void leftRotateByD(int [] arr, int d){
        int n = arr.length;
        d = d % n;   // Handle cases where d > n
        reverse(arr, 0, d-1);      // Step 1
        reverse(arr, d, n-1);     //  Step 2
        reverse(arr, 0, n-1);    //   Step 3
    }
    private static void reverse(int [] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
