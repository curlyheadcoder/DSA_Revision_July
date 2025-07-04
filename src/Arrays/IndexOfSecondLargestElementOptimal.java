package Arrays;

public class IndexOfSecondLargestElementOptimal {
    public static void main(String[] args) {
        int [] arr = {5,12,100,20,8};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
    private static int secondLargest(int [] nums){
        int n = nums.length;
        int res = -1, largest = 0;
        for (int i = 1; i < n; i++) {
            if(nums[i] > nums[largest]){
                res = largest;
                largest = i;
            } else if (nums[i] != nums[largest]) {
                if(res == -1 || nums[i] > nums[res]){
                    res = i;
                }
            }
        }
        return res;
    }
}
