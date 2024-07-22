// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
public class Pattern5{
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int row=0;row<2*n-1;row++){
            // Find total no. of columns in the current row
            //If the row no. is less than n, the total no. of columns will be row no. +1
            //If the row no. is greater than or equal to n the total no. of columns will be calculated as : cols:2*N-row-1
            int totalColsInRow=row<n?row+1:2*n-row-1;
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}