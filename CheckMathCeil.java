public class CheckMathCeil {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6,7};
        // double k = 5.0 / 2.0; // Use floating-point division
        // double c = Math.ceil(3.1);
        //Floor value
        int k=nums.length/2 +1;
        System.out.println(k);
        //Ceil value
        double c=(double)(nums.length/2.0) +1;
        System.out.println(k);
        // System.out.println(c);
    }
}
