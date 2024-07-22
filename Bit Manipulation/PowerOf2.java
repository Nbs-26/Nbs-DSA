//Check whether a number is a power of 2 or not
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(check(0));
    }
    public static boolean check(int num){
        // if(num==0)
        //     return false;
        if((num&(num-1))==0){
            return true;
        }
        return false;
    }
}
