package Arrays;

import java.util.Scanner;

public class MaximumSumSubarray {

    /*
     I/P: arr[] = {2,3,-8,7,-1,2,3}
     O/P: 11    ------> {7,-1,2,3}

     I/P: arr[] = {5,8,3}
     O/P: 16    ------> {5,8,3}

     I/P: arr[] = {-6,-1,-8}
     O/P: -1    -------> {-1}

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] arr = new int [input];
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
//        int ans = maxSumBrute(arr);
//        int ans1 = maxSumOptimal(arr);
//        System.out.println(ans1);

        int ans2 = maxSumSlidingWindow(arr);
        System.out.println(ans2);
    }
    private static int maxSumBrute(int [] arr){
        int res = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr += arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }
//    private static int maxSumOptimal(int [] nums){
//        int n = nums.length;
//        int res = nums[0];
//        int maxEnding = nums[0];
//        for (int i = 1; i < n; i++) {
//            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
//            res = Math.max(res, maxEnding);
//        }
//        return res;
//    }
    private static int maxSumSlidingWindow(int []  nums){
        int maxSum = nums[0], currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
