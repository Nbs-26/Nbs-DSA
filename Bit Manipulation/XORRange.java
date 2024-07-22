//Find the XOR of no.s between a and b.
public class XORRange {
    public static void main(String[] args) {
        System.out.println(findXorRange(4, 10));
    }
    public static int findXorRange(int a,int b){
        int answer=XOR(b)^XOR(a-1);
        return answer;
    }
    public static int XOR(int x){
        //Find XOR of no.s from 0 to x
        if(x%4==0){
            return x;
        }
        else if(x%4==1){
            return 1;
        }
        else if(x%4==2){
            return x+1;
        }
        else {
            return 0;
        }
    }
}
