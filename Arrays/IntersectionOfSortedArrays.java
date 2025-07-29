import java.util.*;;
public class IntersectionOfSortedArrays {
    public static List<Integer> Intersection(int [] num1, int [] num2){
        int p = 0;
        int q = 0;
        // int r = -1;
        List<Integer> retList = new ArrayList<>();
        while (p<num1.length && q<num2.length) {
            if(num1[p] == num2[q] && (retList.isEmpty() || retList.getLast() != num1[p])){
                retList.add(num1[p]);
                p++;
                q++;
            }
            else{
                if(num1[p] < num2[q]){
                    p++;
                }
                else if(num1[p] > num2[q]){
                    q++;
                }
                else{
                    p++;
                    q++;
                }
            }
        }

        return retList;
    }

    public static void main(String[] args) {
        // int [] num1 = UtilMethods.getIntArrayInput();
        // int [] num2 = UtilMethods.getIntArrayInput();
        int [] arr1 = {1,1,2,3,4,5};
        int [] arr2 = {2,3,4,4,5,6};
        System.out.println(Intersection(arr1,arr2));
    }
}
