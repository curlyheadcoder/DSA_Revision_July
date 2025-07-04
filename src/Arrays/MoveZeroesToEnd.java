package Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {10, 2, 0,2,3,0, 3, 0, 6, 5, 0, 6, 2};
        move(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void move(int[] arr) {
        int count = 0; // Index to place the next non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
