package MathsForDSA;

public class CheckPrime {
    public static void main(String[] args) {
        int num=7;
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num){
        if(num==1)
            return false;
        // for(int i=2;i<=Math.sqrt(num);i++){
        //     if(num%i==0){
        //         return false;
        //     }
        // }
        int c=2;
        while(c*c<=num){
            if(num%c==0)
                return false;
            c++;
        }
        return true;
    }
}
