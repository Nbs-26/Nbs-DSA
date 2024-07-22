public class Pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            //For every row, run the column row no. of times.
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            //When one row is printed,we need to add a newLine.
            System.out.println();
        }
    }
}
