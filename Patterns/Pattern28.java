public class Pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int row=0;row<2*n-1;row++){
            // Find total no. of columns in the current row
            //If the row no. is less than n, the total no. of columns will be row no. +1
            //If the row no. is greater than or equal to n the total no. of columns will be calculated as : cols:2*N-row-1
            int totalColsInRow=row<n?row+1:2*n-row-1;
            //No .of spaces in current row can be calculated as : spaces=N-totalColsInRow
            int NoOfSpacesInRow=n-totalColsInRow;
            //Printing spaces in current row
            for(int spaces=0;spaces<NoOfSpacesInRow;spaces++){
                System.out.print(" ");
            }
            //Printing stars in current row.
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
