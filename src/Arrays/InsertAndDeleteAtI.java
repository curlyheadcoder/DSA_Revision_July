package Arrays;

public class InsertAndDeleteAtI {
    public static void main(String[] args) {
        int arr [] = new int [6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        int n = 4;
        int i = 2;
        int val = 3;
        insertAt(arr, n, i, val);
        n++;
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    private static void insertAt(int [] arr, int n, int i, int val){
        for (int j = n - 1; j >= i; j--) {
            arr[j + 1] = arr[j];
        }
        arr[i] = val;
    }
}
