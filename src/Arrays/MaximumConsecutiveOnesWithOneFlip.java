package Arrays;

public class MaximumConsecutiveOnesWithOneFlip {
    public static void main(String[] args) {
        MaximumConsecutiveOnesWithOneFlip ans = new MaximumConsecutiveOnesWithOneFlip();
        int [] nums = {1,0,1,1,0};
        System.out.println(ans.max(nums));
    }
    private static int max(int [] nums){
        int left = 0;
        int zeroCount = 0, maxLen = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            // If more than one 0 in the window, shrink from the left
            while(zeroCount > 1){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            // update the maximum window length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
