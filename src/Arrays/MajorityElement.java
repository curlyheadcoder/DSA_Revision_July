package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {8,7,8,6,6,6,6};
//        System.out.println(findMajority(arr));
        System.out.println(findMajorityMoore(arr) + " frequency : " + findMajority(arr));
    }
    private static int findMajority(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > (nums.length)/2) return i;
        }
        return -1;
    }
    private static int findMajorityMoore(int [] nums){
        int count = 0, candidate = 0;
        for(int num : nums){
            if(count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
