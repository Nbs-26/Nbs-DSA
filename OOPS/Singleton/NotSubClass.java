package OOPS.Singleton;

import OOPS.AccessModifiers.A;

public class NotSubClass {
    public static void main(String[] args) {
        A obj=new A(12,"Sai");
        System.out.println(obj.name);
        // System.out.println(obj.age);//Since it is  protected.
    }
}
