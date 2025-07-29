import java.util.ArrayList;

public class UnionOfSortedArray {
    public static ArrayList<Integer> union(int [] arr1, int [] arr2){
        int p1 = 0;
        int p2 = 0;
        int r = 0;
        ArrayList<Integer> retArray = new ArrayList<>();
        int t = arr1[0]>arr2[0]? arr2[0]:arr1[0];
        retArray.add(t);
        while (p1<arr1.length && p2<arr2.length) {
            if(arr1[p1] == retArray.get(r)){
                p1++;
            }
            else if(arr2[p2] == retArray.get(r)){
                p2++;
            }
            else if(arr1[p1] < arr2[p2]){
                r++;
                retArray.add(arr1[p1]);
                p1++;
            }
            else if(arr2[p2] < arr1[p1]){
                r++;
                retArray.add(arr2[p2]);
                p2++;
            }
            else if(arr2[p2] == arr1[p1]){
                r++;
                retArray.add(arr2[p2]);
                p2++;
                p1++;
            }
        }
        while (p1<arr1.length) {
            if(arr1[p1] == retArray.get(r)){
                p1++;
            }
            else{
                r++;
                retArray.add(arr1[p1]);
                p1++;
            }
        }
        while (p2<arr2.length) {
            if(arr2[p2] == retArray.get(r)){
                p2++;
            }
            else{
                r++;
                retArray.add(arr2[p2]);
                p2++;
            }
        }
        
        return retArray;
    }
    public static void main(String[] args) {
        // int [] arr1 = UtilMethods.getIntArrayInput();
        // int [] arr2 = UtilMethods.getIntArrayInput();
        int [] arr1 = {1,1,2,3,4,5};
        int [] arr2 = {2,3,4,4,5,6};
        System.out.println(union(arr1,arr2));
        // UtilMethods.printIntArray(res);
    }
}
