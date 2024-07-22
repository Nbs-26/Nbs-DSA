//Print the factorial of a number.
public class Factorial {
    public static void main(String[] args) {
        int num=6;
        System.out.println(fact(num));
    }
    public static int fact(int n){
        //Base condition
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
