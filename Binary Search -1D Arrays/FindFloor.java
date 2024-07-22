public class FindFloor{
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=16;
        if(target<arr[0])
            System.out.println("The target element is outside the range of the array ");
        else{
            int floor_index=floor(arr,target);
            System.out.println("Floor value of the target from the given array is = "+arr[floor_index]);
        }
    }
    public static int floor(int arr[],int target){
        int low=0,high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                high=mid-1;
            else 
                low=mid+1;      
        }
        return high;
    }
}