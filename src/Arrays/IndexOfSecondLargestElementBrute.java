package Arrays;

import java.util.Scanner;
// Naive approach (Brute Force)
public class IndexOfSecondLargestElementBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] arr = new int [input];
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = secondLargestIndex(arr);
        System.out.println(ans);
    }
    private static int secondLargestIndex(int [] nums){
        int n = nums.length;
        int largest = getLargest(nums);
        int res = -1;
        for (int i = 0; i < n; i++) {
            if(nums[i] != nums[largest]){
                if(res == -1) res = i;
                else if (nums[i] > nums[res]) {
                    res = i;
                }
            }
        }
        return res;
    }
    private static int getLargest(int [] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[res]) res = i;
        }
        return res;
    }
}
