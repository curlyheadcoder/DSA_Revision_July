package Arrays;

public class TrappingRainWaterLC42 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = getWater(arr);
        System.out.println(ans);
    }
    private static int getWater(int arr[]){
        int n = arr.length;
        int res = 0;
        int [] lMax = new int[n];
        int [] rMax = new int[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }
        rMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }
        for (int i = 1; i < n-1; i++) {
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }
        return res;
    }
}
