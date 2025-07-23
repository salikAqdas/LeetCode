import java.util.Scanner;

public class UtilMethods {
    public static int[] getIntArrayInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input done!");
        return arr;
    }
    public static void printIntArray(int [] arr){
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}