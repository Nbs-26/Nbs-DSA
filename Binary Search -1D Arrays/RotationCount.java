//Find the Rotation Count of a given rotated sorted array with distinct values.
public  class RotationCount {
    public static void main(String[] args) {
        // int arr[]={7,8,1,2,3,4,5,6};
        // int arr[]={2,2,2,3,1,1};
        // int arr[]={4,5,6,7,8,1,2,3};
        int arr[]={2,3,2,2,2,2,2};
        int pivot=findPivot(arr);
        //Rotation count =index of the pivot +1
        System.out.println("Rotation Count = "+(pivot+1));
    }
    //Find the pivot in the rotated sorted array.
    public static int findPivot(int arr[]){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //Case-1
            if(mid<high && arr[mid]>arr[mid+1]){
                return mid;
            }
            //Case-2
            else if(mid>low && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //Case-3
            else if(arr[low]<=arr[mid]){
                low=mid+1;
            }
            //Case -4
            else{
                high=mid-1;
            }
        }
        //If it is a normal sorted array =>Pivot is not present ,hence return -1
        return -1;
    }
}
