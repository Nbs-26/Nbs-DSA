
public class Pattern30{
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            //Adding spaces to the current row
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print("  ");
            }
            //Adding the columns to the current row
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}