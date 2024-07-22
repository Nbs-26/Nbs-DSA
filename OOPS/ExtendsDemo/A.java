package OOPS.ExtendsDemo;

public interface A {
    public void greet();
    default void fun1(){
        System.out.println("Hey");
   }
   // Call via the interface name
   static void sum(){
    System.out.println("Find sum");
   }
}
