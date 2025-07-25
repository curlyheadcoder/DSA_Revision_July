package Arrays;

public class MaximumLengthEvenOddSubarrayUsingKadane {
    public static void main(String[] args) {
        int arr [] = {5,10,20,6,3,8};
        int ans = solve(arr);
        System.out.println(ans);
    }
    private static int solve(int [] arr){
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i-1] % 2 == 0)){
                curr++;
                res = Math.max(res,curr);
            }else{
                curr = 1;
            }
        }
        return res;
    }
}
