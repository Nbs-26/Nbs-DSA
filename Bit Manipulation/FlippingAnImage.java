// //Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for(int[] row:image){
            int start=0,end=row.length-1;
            while(start<=end){
                if(row[start]==row[end]){
                row[start]^=1;
                row[end]=row[start];
            }
            start++;
            end--;
            }
        }
        for(int[] row:image){
            System.out.println(Arrays.toString(row));
        }
    }
}
