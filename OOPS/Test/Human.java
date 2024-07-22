package OOPS.Test;

public class Human {
    //Instance Variables
    String name;
    int age;
    float salary;
    static long population;//Common for all objects
    //Static Method
    static void message(){
        System.out.println("Hello World");
    }
    
    //Parametrized Constructor
    public Human(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        Human.population+=1;
        Human.message();
    }
}
