//Search whether a target element is present in rotated sorted array using binary search and recursion.
public class RotatedBS {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 0, arr.length-1, 23));
    }
    public static int search(int[] arr,int start,int end,int target){
        //Base Condition
        if(start>end){
            return -1;
        }
        //Normal Flow
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return search(arr, start, mid-1, target);
            }
            else{
                return search(arr, mid+1, end, target);
            }
        }
        else{
            if(target>=arr[mid] && target<=arr[end]){
                return search(arr, mid+1, end, target);
            }
            else{
                return search(arr, start, mid-1, target);
            }
        }
    }
}
