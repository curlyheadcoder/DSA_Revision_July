package Arrays;

import java.util.Scanner;

public class ReverseAnArrayRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        reverseRecursively(arr,0, size-1);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    private static void reverseRecursively(int [] arr, int start, int end){
        if(start >= end) return;     // Base Case

        // Swap arr[start] and arr[end]
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Call Recursively
        reverseRecursively(arr,start+1, end-1);
    }
}
