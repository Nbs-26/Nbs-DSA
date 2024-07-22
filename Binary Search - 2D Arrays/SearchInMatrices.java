//Searching in Matrices sorted in row-wise and column-wise manner
import java.util.Arrays;
public class SearchInMatrices{
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=51;
        // int[] pos=binarySearch(arr,target);
        // if (pos[0]==-1)
        //     System.out.println("Target not found");
        // else 
        //     System.out.println("Target is found  at index = ["+pos[0]+","+pos[1]+"]");   
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }
    public static int[] binarySearch(int[][]arr,int target){
        //Define the lower bound as 1st row
        int start=0;
        //Define the upper bound as last column
        int end=arr.length-1;
        //Start the binary search
        while(start<=end){
            if(target==arr[start][end]){
                return new int[]{start,end};
            }
            else if(target<arr[start][end]){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}