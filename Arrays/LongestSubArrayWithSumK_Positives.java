public class LongestSubArrayWithSumK_Positives {
 public static int getSubArrayLength(int[] arr, int k){
    int maxLen = 0;
    int l =0;
    int r = 1;
    int sum = arr[0];
    if(sum == k) maxLen = 1;
    while (r<arr.length) {
        sum += arr[r++];
        if(sum == k){
            maxLen = Math.max(maxLen,r-l);
            // r++;
        }
        else if(sum > k){
            sum -= arr[l];
            l++;
        }
        if(sum == k){
            maxLen = Math.max(maxLen,r-l);
        }
    }
    return maxLen;


 }
    public static void main(String[] args) {
        // int [] nums = UtilMethods.getIntArrayInput();
        int [] nums = {1,2,3,1,1,1,1,3,3};
        int k = 3;
        System.out.println(getSubArrayLength(nums,k));
    }

}
