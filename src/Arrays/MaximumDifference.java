package Arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        int [] arr = {2,3,10,6,4,8,1};
        int ans = maxDiff(arr);
        System.out.println(ans);
    }
    private static int maxDiff(int [] arr){
        int n = arr.length;
        int res = arr[1] - arr[0], minVal = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return res;
    }
}
