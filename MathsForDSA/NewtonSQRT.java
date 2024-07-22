//Find the square root of a number using Newton Raphson method
package MathsForDSA;
public class NewtonSQRT {
    public static void main(String[] args) {
        double num=40;
        System.out.printf("%.3f",findSquareRoot(num));
    }
    public static double findSquareRoot(double num){
        double x=num;
        double root=0.0;
        while(true){
            root=0.5*(x+(num/x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}
