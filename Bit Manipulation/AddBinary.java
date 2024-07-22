//Given two binary strings a and b, return their sum as a binary string.
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
    public static String addBinary(String a, String b) {
        int x=decimal(Integer.parseInt(a));
        int y=decimal(Integer.parseInt(b));
        int result=x+y;
        return Integer.toBinaryString(result);
    }
    public static int decimal(int bin){
        int base=1,answer=0;
        while(bin>0){
            int last=bin%10;
            answer+=base*last;
            bin=bin/10;
            base*=2;
        }
        return answer;
    }
}