package Arrays;

public class LargestElementInAnArrayBrute {
    public static void main(String[] args) {
        int [] arr = {10,24,33,21,56,42,21};
        int ans = findIndexOfLarget(arr);
        System.out.println(ans);
    }
    // Brute (Naive) Approach    O(n*n)
    private static int findIndexOfLarget(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
    }
}
