package Arrays;

public class MaximumCircularSubarraySum {
    public static void main(String[] args) {
        int [] arr = {5,10,-5, 7, 5,-8, 3, 9, -7};
        int ans = maxCircularSubarraySum(arr);
        System.out.println(ans);
    }

    private static int kadane(int [] arr){
        int maxSoFar = arr[0], curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(curr + arr[i], arr[i]);
            maxSoFar = Math.max(maxSoFar, curr);
        }
        return maxSoFar;
    }

    private static int maxCircularSubarraySum(int [] arr){
        int n = arr.length;
        // Step 1: Standard Kadane's to find max subarray sum (non-circular)
        int maxKadane = kadane(arr);
        // Step 2: Calculate total array sum
        int totalSum = 0;
        for (int i = 1; i < n; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];              // Invert elements
        }

        // Step 3: Kadane's on inverted array to find min subarray sum
        int maxInvertedKadane = kadane(arr);
        int circularMax = totalSum + maxInvertedKadane;   // max sum when wrapping

        // Step 4: Handle all-negative case
        if(circularMax == 0) return maxKadane;
        return Math.max(maxKadane, circularMax);
    }

}
