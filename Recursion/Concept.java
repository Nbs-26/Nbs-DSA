//Application of prefix and postfix increment operator
public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // fun(n--);//This gives stack overflow error,because n-- is a postfix decrement operator.It first uses the value of variable and then decremnts its value.Hence the same recursive call with the same parameter value is happened,thus base condition is not reached.
        fun(--n);
    }
}
