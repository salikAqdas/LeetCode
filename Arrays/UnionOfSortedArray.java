public class UnionOfSortedArray {
    public static int[] union(int [] arr1, int [] arr2){
        int p1 = 0;
        int p2 = 0;
        int r = 0;
        int [] retArray = new int[arr1.length+arr2.length];
        retArray[0] = arr1[0]>arr2[0]? arr2[0]:arr1[0];
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1] == arr2[p2] && arr1[p1] == retArray[r]){
                p1++;
                p2++;
            }
            else if(arr1[p1] != retArray[r] && arr1[p1] < arr2[p2]){
                retArray[++r] = arr1[p1++];
            }
            else if(arr2[p1] != retArray[r] && arr2[p2] < arr1[p1]){
                retArray[++r] = arr2[p2++];
            }
            else if(arr1[p1] == arr2[p2] && arr1[p1] != retArray[r]){
                retArray[++r] = arr1[p1++];
                p2++;
            }
            else if(arr1[p1] == retArray[r]){
                p1++;
            }
            else if(arr2[p2] == retArray[r]){
                p2++;
            }

        }
        while (p1 < arr1.length) {
            if(arr1[p1] != retArray[r]){
                retArray[++r] = arr1[p1++];
            }
            else{
                p1++;
            }
        }
        while (p2 < arr2.length) {
            if(arr2[p2] != retArray[r]){
                retArray[++r] = arr2[p2++];
            }
            else{
                p2++;
            }
        }
        int [] newArr = new int[r];
        for(int i=0;i<r;i++){
            newArr[i] = retArray[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        // int [] arr1 = UtilMethods.getIntArrayInput();
        // int [] arr2 = UtilMethods.getIntArrayInput();
        int [] arr1 = {1,1,2,3,4,5};
        int [] arr2 = {2,3,4,4,5,6};
        int [] res = union(arr1,arr2);
        UtilMethods.printIntArray(res);
    }
}
