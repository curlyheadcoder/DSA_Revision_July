package Arrays;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        if (isSorted(nums)) System.out.println("Sorted");
        else System.out.println("Not Sorted");
    }
    private static boolean isSorted(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]  > arr[i + 1]) return false;
        }
        return true;
    }
}
