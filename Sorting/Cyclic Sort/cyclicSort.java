//Cyclic sort is only applicable when the array consists of a range of values from 1 to N.

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int arr[]){
        //CHECK->SWAP->MOVE
        int j=0;//For incrementing over the array
        while(j<arr.length){
            //Here i will calculate the correct index of the element at jth index
            int i=arr[j]-1;
            //If the element at jth index is not present at the correct index, then swap the corresponding element with the element at its correct index
            if(j!=i){
                swap(arr,i,j);
            }
            else{//If the element is present at its correct index then ,move to the next element.
                j++;
            }
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}