//Find the sum of nth row of Pascal's Triangle
public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(findSum(n));
    }
    public static int findSum(int n){
        // return (int)Math.pow(2,n-1);
        return 1<<(n-1);
    }
}
