package OOPS.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFun {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        // list.forEach((item)->System.out.println(item*2));

        // Consumer<Integer> fun=(item)-> System.out.println(item*2);
        // list.forEach(fun);

        Operation sum=(a,b)-> a+b;
        Operation prod=(a,b)->a*b;
        Operation sub=(a,b)->a-b;
        LambdaFun myCalculator=new LambdaFun();
        System.out.println(myCalculator.operate(2, 3, sub));
    }
    
    private int operate(int a,int b,Operation op){
        return op.operation(a, b);
    }

}
@FunctionalInterface//An interface which contains only one abstract method
interface Operation{
    int operation(int a,int b);
}
