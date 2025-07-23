import java.util.Scanner;

public class Striver_Easy_LinearSearch {
    public static int linearSearch(int [] nums, int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x) return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] nums = UtilMethods.getIntArrayInput();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(linearSearch(nums, x));
        sc.close();
    }
}
