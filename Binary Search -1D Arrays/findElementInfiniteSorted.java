public class findElementInfiniteSorted{
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,25,30};
        int target=30;
        int res=findPosition(arr, target);
        System.out.println(res);

    }
    public static int findPosition(int arr[],int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        int ans=binarySearch(arr, target, start, end);
        return ans;
    }
    public static int binarySearch(int arr[],int target,int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}