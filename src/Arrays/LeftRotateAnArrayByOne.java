package Arrays;

public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        lRotateOne(nums);
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
    private static void lRotateOne(int [] arr){
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
