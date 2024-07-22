// Fibonacci Series: 0,1,1,2,3,5,8,13,21......
public class FibonacciNumber{
    public static void main(String[] args) {
        for(int i=0;i<9;i++){
            System.out.println(fiboFormula(i));
        }
            System.out.println(fiboFormula(50));

    }
    public static int fiboFormula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        //Formula=[((1+sqrt(5))/2)^n - ((1-sqrt(5))/2)^n]/sqrt(5)
    }
    public static int fibo(int n){
        //Base Condition
        if(n<=1){
            return n;
        }
        //Non-Tailed Recursion : Some operations are performed on the returned values of the recursion call
        return fibo(n-1)+fibo(n-2);
    }
}