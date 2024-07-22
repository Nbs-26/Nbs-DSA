package OOPS.abstractDemo;

public  abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age){
        this.age=age;
        VALUE=33;
    }

    static void display(){
        System.out.println("Hey world");
    }

    void normal(){
        System.out.println("This is a normal method");
    }
    abstract void career();
    abstract void partner();
}
