import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr={12,11,4,5,3,23,1,0};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int start,int end){
        //Base Condition
        if(end-start==0){
            return;
        }
        //Calculate the middle index of the current array
        int mid=start+(end-start)/2;
        mergeSort(arr, start,mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[]arr,int start,int mid,int end){
        //Calculate the length of first half to be merged
        int n1=mid-start+1;
        //Calculate the length of second half to be merged
        int n2=end-mid;
        //Create two temporary arrays
        int[] T1=new int[n1];
        int[] T2=new int[n2];
        //Copy the elements of first half of original array into T1
        for (int i=0;i<n1;i++){
            T1[i]=arr[start+i];
        }
        //Copy the elements of second half of original array into T2
        for (int i=0;i<n2;i++){
            T2[i]=arr[mid+1+i];
        }
        int i=0;//Pointer to the T1 array
        int j=0;//Pointer to the T2 array
        int k=start;//Pointer to the original array
        while(i<n1 && j<n2){
            if(T1[i]<T2[j]){
                arr[k]=T1[i];
                i++;
            }
            else{
                arr[k]=T2[j];
                j++;
            }
            k++;
        }
        //Copy the elements which are left in any of temporary arrays into the original
        while(i<n1){
            arr[k]=T1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=T2[j];
            j++;
            k++;
        }
    }
}
