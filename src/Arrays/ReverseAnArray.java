package Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverse(arr);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    private static void reverse(int [] arr){
        int n = arr.length;
        int low = 0, high = n - 1;
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
