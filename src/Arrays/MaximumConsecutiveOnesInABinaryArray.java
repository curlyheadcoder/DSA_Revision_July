package Arrays;

public class MaximumConsecutiveOnesInABinaryArray {
    /* I/P:    arr [] = {0,1,1,0,1,0}
       O/P:          2

       I/P:    arr[] = {1,1,1,1}
       O/P:         4

       I/P:    arr[] = {0,0,0}
       O/P:        0
      */

    public static void main(String[] args) {
        int [] arr0 = {0,1,1,0,1,0};
        int [] arr1 = {0,0,0};
        int [] arr2 = {1,1,1,1};
        int ans = maxConsecutiveOnes(arr0);
        int ans1 = maxConsecutiveOnes(arr1);
        int ans2 = maxConsecutiveOnes(arr2);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    private static int maxConsecutiveOnes(int [] arr){
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                if(arr[j] == 1) curr++;
                else break;;
            }
            res = Math.max(curr, res);
        }
        return res;
    }
}
