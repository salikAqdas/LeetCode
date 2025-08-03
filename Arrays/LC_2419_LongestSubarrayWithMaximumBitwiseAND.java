public class LC_2419_LongestSubarrayWithMaximumBitwiseAND {
    public static int longestSubarray(int[] nums) {
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[maxIndex] < nums[i]) {maxIndex = i;}
        }
        int l = maxIndex;
        int count =0;
        while( nums[l] == nums[maxIndex]){
            count++;
            l++;
        }
        return count;

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(longestSubarray(nums));
    }
}
