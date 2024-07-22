//Find the number of set bits in a number
public class NoOfSetBits {
    public static void main(String[] args) {
        int num=45;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(findNoOfSetBits(num));
    }
    public static int findNoOfSetBits(int num){
        int count=0;
        while(num>0){
            count++;
            num=(num&(num-1));
        }
        return count;
    }
}
