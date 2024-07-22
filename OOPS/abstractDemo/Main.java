package OOPS.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s=new Son(30);
        System.out.println( s.age);
        s.career();
        s.partner();
        Daughter d=new Daughter(28);
        d.career();
        d.partner();
        Parent.display();
        s.normal();
        // Parent obj=new Parent(34);//Since Parent is a abtsract class.
    }
}