import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=74;
        System.out.println(Arrays.toString(search(arr, target)));

    }
    //Search in the row provided between the columns provided
    public static int[] binarySearch(int arr[][],int currRow,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
        int cMid=cStart+(cEnd-cStart)/2;
        if(arr[currRow][cMid]==target){
            return new int[]{currRow,cMid};
        }
        else if(target<arr[currRow][cMid]){
            cEnd=cMid-1;
        }
        else{
            cStart=cMid+1;
        }
    }
    return new int[]{-1,-1};//Element not found
    }
    public static int[] search(int arr[][],int target){
        //Find the no .of rows and columns
        int rows=arr.length;
        int cols=arr[0].length;
        //Find the middle column
        int cMid=(cols-1)/2;
        //Initialising row start and row end variables.
        int rStart=0,rEnd=rows-1;
        //Edge Case
        if(rows==1){
            return binarySearch(arr, 0, 0, cols-1, target);
        }
        //Implement binary search on the middle column
        //while this is true ,it will have more than two rows
        while(rStart<=rEnd-2){
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            else if(target<arr[mid][cMid]){
                rEnd=mid;
            }
            else{
                rStart=mid;
            }
        }

        //Now we have two rows
        //Check whether the target is present in the col of the two rows
        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //Check in the four halves
        //Search in the first half
        if(target<=arr[rStart][cMid-1]){
            return binarySearch(arr, rStart, 0, cMid-1, target);
        }
        //Search in the second half
        else if(target>=arr[rStart][cMid+1]&& target<=arr[rStart][cols-1]){
            return binarySearch(arr, rStart, cMid+1, cols-1, target);
        }
        //Search in the third half
        else if(target<=arr[rStart+1][cMid-1]){
            return binarySearch(arr, rStart+1, 0, cMid-1, target);
        }
        //Search in the fourth half
        else{
            return binarySearch(arr, rStart+1, cMid+1, cols-1, target);
        }
    }
}
