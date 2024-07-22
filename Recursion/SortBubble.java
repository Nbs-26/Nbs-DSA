import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {
        int[] arr={4,3,4,2,2,1};
        fun(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void fun(int[] arr,int i,int j){
        //Base Condition
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
            fun(arr,i,j+1);
        }
        else{
            fun(arr, i-1, 0);
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

