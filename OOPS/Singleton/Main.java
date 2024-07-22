package OOPS.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        System.out.println(obj.age);
        System.out.println(obj.name);
        Singleton obj1=Singleton.getInstance();
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj2.age);
        System.out.println(obj2.name);
    }
}