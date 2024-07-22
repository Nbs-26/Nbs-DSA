public class SetithBit {
    public static void main(String[] args) {
        int num=182,i=1;
        System.out.println(findAnswer(num,i));
    }
    public static int findAnswer(int num,int i){
        //Creation of Mask
        int mask=1<<i-1;
        return num|mask;//The ith bet is set in the returned value
    }
}
