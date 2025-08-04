package Arrays;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr = {2,8,3,9,6,5,4};
        int target = 20;
        System.out.println(isSubSum(arr, target));
    }
    private static boolean isSubSum(int [] arr, int targetSum){
        int st = 0, currSum = 0;
        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];
            while (targetSum < currSum){
                currSum -= arr[st];
                st++;
            }
            if(currSum == targetSum) return true;
        }
        return false;
    }
}
