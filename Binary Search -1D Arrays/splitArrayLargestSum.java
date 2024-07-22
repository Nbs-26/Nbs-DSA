public class splitArrayLargestSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;//No. of subarrays
        System.out.println("Minimised largest sum = "+splitArray(arr, 2));
    }
    public static int splitArray(int nums[],int k){
        int start=0,end=0;
        for (int i=0;i<nums.length;i++){
            //Finding the minimum answer of the question
            start=Math.max(start,nums[i]);
            //Finding the maximum answer of the question
            end+=nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            //mid can be the potential answer
            int pieces=1,sum=0;
            //Calculating the no. of pieces or subarrays ,the array will be divided if the largest subarray sum = mid
            for(int num:nums){
                if((sum+num)>mid){
                    pieces++;
                    sum=num;
                }else{
                    sum+=num;
                }
            }
            //Check 1: if the calculated no. of subarrays are less than or = k,then it means we have to decrease the sum in order to increase the no. of subarrays. 
            if(pieces<=k){
                end=mid;
            }
            //Check 2:if the calculated no. of subarrays are greater than k,then it means we have to increase the sum in order to decrease the no. of subarrays.
            else{
                start=mid+1;
            }
        }
        //At the last iteration of the loop,start=mid=end =>It means the optimised (minimised) largest sum is found.
        return end;//or return start as both are equal.
 }   
}
