public class FindithBit {
    public static void main(String[] args) {
        int num=182,i=8;
        System.out.println(findAnswer(num,i));
    }
    public static int findAnswer(int n,int i){
        //Creation of mask
        int mask=1<<i-1;
        if((n&mask)==0){
            return 0;
        }
        return 1;
    }
}
