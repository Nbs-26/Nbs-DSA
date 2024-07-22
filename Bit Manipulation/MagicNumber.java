//Amazon Question
public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        System.out.println(findMagicNumber(n));
    }
    // public static int findMagicNumber(int n){
    //     int k=1,result=0;
    //     while(n>0){
    //         int rem=n%2;
    //         result+=rem*Math.pow(5,k++);
    //         n/=2;
    //     }
    //     return result;
    // }
    public static int findMagicNumber(int n){
        int result=0,base=5;
        while(n>0){
            int last=n&1;
            result+=last*base;
            base*=5;
            n=n>>1;
        }
        return result;
    }
}