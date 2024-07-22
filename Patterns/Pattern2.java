
// *
// **
// ***
// ****
// *****
import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n=sc.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            //For every row, run the column row no. of times.
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            //When one row is printed,we need to add a newLine.
            System.out.println();
        }
    }
}
