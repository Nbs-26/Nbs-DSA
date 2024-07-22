public class SearchRotatedSortedArr {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,3,3};
        int target=3;
        int pivot=findPivot(arr);//Finding the pivot of the rotated sorted array
        int res=-1;
        if(pivot==-1){//No pivot is found=>It is a normal sorted array
            res= binarySearch(arr, target, 0, arr.length-1);
        }
        else{
        if(target==arr[pivot]){
            res=pivot;
        }
        else if(target>=arr[0]){
            res=binarySearch(arr, target, 0, pivot-1);
        }
        else{
            res=binarySearch(arr, target,pivot+1, arr.length-1);
        }
        }
        System.out.println("Target is present at index : "+res);
    }
    public static int binarySearch(int arr[],int target,int low,int high){
        // int low=start,high=end;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;             
            }
        }
        return -1;
    }
    //this will not work in duplicate values
    public static int findPivot(int arr[]){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=start){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
