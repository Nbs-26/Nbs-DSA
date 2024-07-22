package OOPS.ExtendsDemo;

public interface B extends A{
     void fun();
     default void fun1(){
          System.out.println("Hey");
     }
}
