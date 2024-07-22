public class BinarySearch{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=-9943;
        System.out.println(binarySearch(arr,0,arr.length-1,target));
    }
    public static int binarySearch(int arr[],int low,int high,int target){
        //Base Condition: When element is not found ,return -1
        if(low>high){
            return -1;            
        }
        int mid=low+(high-low)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){
            return binarySearch(arr,low, mid-1, target);
        }
        else{
            return binarySearch(arr,mid+1, high, target);
        }
    }
}