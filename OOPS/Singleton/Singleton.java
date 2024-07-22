package OOPS.Singleton;

public class Singleton {
    static Singleton instance;
    String name;
    int age;
    private Singleton(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Hey, I have executed only once.");
    }
    static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton("Sai",22);
            return instance;
        }
        else{
            return instance;
        }
    }
}