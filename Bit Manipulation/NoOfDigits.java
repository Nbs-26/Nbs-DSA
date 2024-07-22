//Find the no. of digits of a number in base -b
public class NoOfDigits {
    public static void main(String[] args) {
        int num=3,base=2;
        System.out.println(calculate(num, base));
    }
    public static int calculate(int num,int base){
        int result=(int)(Math.log(num)/Math.log(base))+1;
        return result;
    }
}
