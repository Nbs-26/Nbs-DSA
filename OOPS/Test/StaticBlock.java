package OOPS.Test;

public class StaticBlock {
    static int a=4;
    static int b;
    //The static Block will get executed exactly once 
    //when the class is first loaded/when the first object is created.
    static{
        System.out.println("I am in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();//The static block will be executed only once when obj is created.
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b=8;        
        StaticBlock obj1=new StaticBlock();//The static block will not execute during obj2 creation,
        // hence no message is displayed and the value of b is not changed ,it remains as it is done in line -16
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
