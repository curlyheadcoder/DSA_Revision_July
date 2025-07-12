package Arrays;

import java.util.Scanner;

public class MaximumLengthEvenOddSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxEvenOdd(arr);
        System.out.println(ans);
    }
    private static int maxEvenOdd(int [] arr){
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i+1; j < n; j++) {
                if((arr[j] % 2 == 0 && arr[j-1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j-1] % 2 == 0)){
                    curr++;
                }else break;
            }
            res = Math.max(res,curr);
        }
        return res;
    }
}
