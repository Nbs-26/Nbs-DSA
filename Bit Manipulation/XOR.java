//Find the XOR of numbers from 0 to a.
public class XOR {
    public static void main(String[] args) {
        int a=8;
        System.out.println(findXor(a));
    }
    public static int findXor(int a){
        if(a%4==0){
            return a;
        }
        else if(a%4==1){
            return 1;
        }
        else if(a%4==2){
            return a+1;
        }
        else {
            return 0;
        }
    }
}
