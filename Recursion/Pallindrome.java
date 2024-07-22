public class Pallindrome {
    public static void main(String[] args) {
        int num=1441;
        if(num==reverse(num)){
            System.out.println(num+" is pallindrome");
        }
        else{
            System.out.println(num+" is not a pallindrome");
        }
    }
    public static int reverse(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        //Base Condition
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
