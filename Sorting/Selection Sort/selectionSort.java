import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int arr[]){
        int min=0;
        //Run n-1 times the outer loop
        for(int i=0;i<arr.length-1;i++){
            //Set the current(ith) element as the minimum element.
            min=i;
            // Find the minimum element in the unsorted portion of the array
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //Swap the current element with the minimum element.
            if(min!=i){
                swap(arr, min, i);
            }
        }
    }
    public static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
