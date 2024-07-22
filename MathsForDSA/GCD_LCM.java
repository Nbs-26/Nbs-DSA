package MathsForDSA;

public class GCD_LCM {
    public static void main(String[] args) {
        int a=16,b=36;
        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));
    }
    public static int GCD(int a ,int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    public static int LCM(int a ,int b){
        return (a*b)/GCD(a, b);
    }
}
