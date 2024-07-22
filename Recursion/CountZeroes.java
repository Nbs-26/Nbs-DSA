//Count the number of zeroes of  a number.
public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(fun(3002,0));
    }
    //Special pattern on how to pass a value to above calls.
    public static int fun(int n ,int count){
        //Base condition
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return fun(n/10, count+1);
        }
        else{
            return fun(n/10, count);
        }
    }
}
