import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        bubble(arr);//Bubble sort is an in-place sorting algorithm because it does not require an external array for sorting.It sorts in the original array itself.
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int nums[]){
        boolean swapped;
        // Run the passes for n-1 times
        for(int i=0;i<nums.length-1;i++){
            //for each step, max item will come at the last respective index
            swapped=false;
            for(int j=0;j<nums.length-i-1;j++){
                //swap if the item is greater than the next item
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            //If you did not swap for a particular value of i,it means that the array is sorted.
            if(swapped==false){
                break;
            }
        }
    }
}