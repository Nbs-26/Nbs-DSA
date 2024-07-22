//Reverse a number using recursion
public class ReverseNum {
    static int rev=0;
    public static void main(String[] args) {
        int num=45632;
        reverse1(num);
        System.out.println(rev);
        System.out.println(reverse2(num));
    }
    public static void reverse1(int n){
        //Base condition
        if(n==0){
            return;
        }        
        rev=rev*10+(n%10);
        reverse1(n/10);
    }
    public static int reverse2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);    
    }
    public static int helper(int n , int digits){
        //Base Condition
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10, digits-1);
    }
}
