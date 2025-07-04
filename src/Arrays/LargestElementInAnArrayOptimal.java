package Arrays;

// Optimal Approach    O(n)

public class LargestElementInAnArrayOptimal {
    public static void main(String[] args) {
        int [] arr = {10,23,35,21,55,32,11,98,43};
        int ans = findIndexOfLargest(arr);
        System.out.println(ans);
    }
    private static int findIndexOfLargest(int [] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[res]) res = i;
        }
        return res;
    }
}
