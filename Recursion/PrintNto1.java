public class PrintNto1 {
    public static void main(String[] args) {
        int n=5;
        print3(n);
    }
    //Print the numbers from N to 1
    public static void print1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ "   ");
        print1(n-1);
    }
    //Print the numbers from 1 to N
    public static void print2(int n){
        if(n==0){
            return;
        }
        print2(n-1);
        System.out.print(n+ "   ");
    }
    //Print the numbers from N to 1 and 1 to N
    public static void print3(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ "   ");
        print3(n-1);
        System.out.print(n+ "   ");
    }
}
