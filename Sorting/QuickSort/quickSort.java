package Sorting.QuickSort;
import java.util.Arrays;
public class quickSort {
    public static void main(String[] args) {
        int []arr={45,32,11,22,34,55};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];
        while(start<=end){
            if(!(nums[start]<pivot)&&!(nums[end]>pivot)){
                swap(nums,start,end);
                start++;
                end--;
            }
            else if (nums[start]<pivot) {
                start++;
            }
            else if(nums[end]>pivot){
                end--;
            }
        }
        //Sort the arrays from two halves
        sort(nums, low, end);
        sort(nums, start, high);
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}