//Find whether the array is sorted in ascending order or not.
public class ArraySorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,54,45,66};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr,int ind){
        //Base Condition
        if(ind==arr.length-1){
            return true;
        }
        
        if(arr[ind]>arr[ind+1]){
            return false;
        }
        return isSorted(arr, ind+1);
    }
}
