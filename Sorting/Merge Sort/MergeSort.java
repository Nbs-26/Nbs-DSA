import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }    

    public static int[] mergeSort(int[] arr){
        //Base Condition
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] first,int[] second){
        int[] result=new int[first.length+second.length];
        int i=0;//Pointing to the first array
        int j=0;//Pointing to the second array
        int k=0;//Pointing to the merged array
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                result[k]=first[i];
                i++;
            }
            else{
                result[k]=second[j];
                j++;
            }
            k++;
        }
        //If the elements in any of the two arrays are left ,add those elements at the end of the result array.
        while(i<first.length){
            result[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            result[k]=second[j];
            j++;
            k++;
        }
        return result;
    }
}
