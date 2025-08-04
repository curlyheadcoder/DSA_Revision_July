package Arrays;

public class MaxSumOfKConsecutiveElements {
    public static void main(String[] args) {
        int [] arr = {1,8,30,-5,20,7};
        int ans = maxSum(arr, 4);
        System.out.println(ans);
    }
    private static int maxSum(int [] arr, int k){
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        int res = curr;
        for (int i = k; i < arr.length; i++) {
            curr = curr + arr[i] - arr[i - k];
            res = Math.max(res, curr);
        }
        return res;
    }
}
