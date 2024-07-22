public class FindCeiling{
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=2;
        if(target>arr[arr.length-1])
            System.out.println("The target element is outside the range of the array ");
        else{
            int ceil_index=ceiling(arr,target);
            System.out.println("Ceiling of the target from the given array is = "+arr[ceil_index]);
        }
    }
    public static int ceiling(int arr[],int target){
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
        return low;
    }
}