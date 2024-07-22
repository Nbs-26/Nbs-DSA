import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int arr[]){
        //Run n-1 no. of passes in the outer loop
        for (int i = 0; i < arr.length-1; i++) {
            //The inner loop will sort the array till index i+1
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){//When the j th element is smaller than its previous element,then swap
                    swap(arr,j,j-1);
                }
                else{//When element at j is not smaller than element at j-1,break out of the loop beacuse the LHS part of the array is already sorted.
                    break;
                }
            }
        }
    }
    public static void swap(int arr[],int i,int j){
        //For swapping the current and previous elements.
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}