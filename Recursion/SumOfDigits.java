//Find the sum of digits of a number using recursion
public class SumOfDigits {
    public static void main(String[] args) {
        int num=134289;
        System.out.println(sum(num));
    }
    public static int sum(int n){
        //Base condition
        if(n==0){
            return 0;
        }
        return sum(n/10)+(n%10);
    }
}
