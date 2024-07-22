import java.util.Arrays;

public class SortSelection {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,54,322,11,54,34,22,11,2,1,6,78,9,0};
        // int[] arr={3,1,5,4,2};
        sort(arr, 0, 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int i,int j,int min){
        //Base Condition
        if(i==arr.length-1){
            return;
        }
        if(j<arr.length){
            if(arr[j]<arr[min]){
                min=j;
            }
            sort(arr, i, j+1, min);

        }
        else{
            if(min!=i){
                swap(arr,i,min);
            }
            sort(arr, i+1, i+2, i+1);
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
