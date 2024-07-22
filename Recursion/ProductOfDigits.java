//Find the product of digits of a number.
public class ProductOfDigits {
    public static void main(String[] args) {
        int num=57;
        System.out.println(product(num));
    }
    public static int product(int n){
        //Base condition
        if(n==0){
            return 1;
        }
        return product(n/10)*(n%10);
    }
}
